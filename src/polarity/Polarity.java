package polarity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import hdfs.HDFSConnection;

public class Polarity {

	public void positiveList(String p) {
		try {
			FileSystem fs = HDFSConnection.getConnection();
			BufferedReader fis = new BufferedReader(new InputStreamReader(fs.open(new Path(p))));
			String word;
			while ((word = fis.readLine()) != null) {
				PolarityDriver.goodWords.add(word);
			}
			fis.close();
		} catch (Exception ioe) {
			System.err.println("Caught exception..File not found");
		}
	}

	public void negativeList(String p) {
		try {
			FileSystem fs = HDFSConnection.getConnection();
			BufferedReader fis = new BufferedReader(new InputStreamReader(fs.open(new Path(p))));
			String word;
			while ((word = fis.readLine()) != null) {
				PolarityDriver.badWords.add(word);
			}
			fis.close();
		} catch (Exception ioe) {
			System.err.println("Caught exception..File not found");
		}
	}

}
