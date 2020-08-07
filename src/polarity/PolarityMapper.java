package polarity;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

public class PolarityMapper extends Mapper<LongWritable, Text, Text, Text> {
	private Text product_id = new Text();
	private Text body = new Text();

	public void map(LongWritable ikey, Text ivalue, Context context) throws IOException, InterruptedException {

//		FileSplit fileSplit = (FileSplit) context.getInputSplit();
//		String filename = fileSplit.getPath().getName();

		String line[] = ivalue.toString().split("\t\t");
		String line1[] = line[1].split("\t");
		String line2[] = line1[1].split(" ");
		// Initially had errors thrown when using larger data file beacuse some lines
		// did not have 8 entries
		// Checking length before accessing.. Also wrapped in a try/catch to be extra
		// safe

		try {
			for (String line3 : line2) {
				body.set("tweets");
				product_id.set(line3);
				context.write(body, product_id);
			}

		} catch (Exception e) {
			System.err.println("Caught exception while parsing line of data (data is inconsistent)");
		}

	}

}
