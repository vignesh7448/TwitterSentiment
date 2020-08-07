package polarity;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class PolarityReducer extends Reducer<Text, Text, Text, Text> {
	public static int countPos;
	public static int countNeg;
	public static int countNut;

	public void reduce(Text _key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
		// process values
		float countPos=0;
		float countNeg=0;
		float countNut=0;
		float count=0;
		for (Text val : values) {

			String s1[] = val.toString().replaceAll("[^\\p{L}\\p{Z}]", "").split(" ");

			for (String word : s1) {
				// Using HashSet because lookup is O(1) -- arraylist or similar is O(n)
				if (PolarityDriver.goodWords.contains(word)) {
					countPos = countPos + 1;
					count = count  + 1;
				}else
				if (PolarityDriver.badWords.contains(word)) {
					countNeg = countNeg + 1;
					count = count  + 1;
				}else {
					countNut = countNut + 1;
					count = count  + 1;
				}
				
			}
			
		}
		float per1 = (countPos*100)/count;
		float per2 = (countNeg*100)/count;
		float per3 = (countNut*100)/count;
		Text val1 = new Text();
		val1.set(countPos+" "+per1+"%:"+countNeg+" "+per2 +"%:"+countNut+" "+per3+"%:"+count);
		context.write(_key, val1);
		System.out.println("total "+count);
	}
}