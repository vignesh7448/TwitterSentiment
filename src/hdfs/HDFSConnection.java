package hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

public class HDFSConnection {
	public static FileSystem getConnection() {
		FileSystem fs = null;
		try {

			Configuration conf = new Configuration();
			conf.set("fs.default.name", "hdfs://localhost:9000");
			fs = FileSystem.get(conf);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return fs;
	}
}
