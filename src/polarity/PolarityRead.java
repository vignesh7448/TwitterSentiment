package polarity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import hdfs.HDFSConnection;

public class PolarityRead {

	public static HashMap<String, String> readPolarity() {
		HashMap<String, String> hs = new HashMap<>();
		try {

			FileSystem fs = HDFSConnection.getConnection();
			Path path = new Path("hdfs://localhost:9000/tweetclassify/part-r-00000");
			BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(path)));
			String line = "";
			while ((line = br.readLine()) != null) {
				String line1[] = line.split("\t");
				String line2[] = line1[1].split(":");
				String pos = line2[0].split(" ")[1];
				String neg = line2[1].split(" ")[1];
				String nut = line2[2].split(" ")[1];

				hs.put("p", pos);
				hs.put("n", neg);
				hs.put("nut", nut);
			}

		} catch (Exception e) {

			System.out.println(e);

		}
		return hs;
	}

	public static void main(String[] args) {

	}

}
