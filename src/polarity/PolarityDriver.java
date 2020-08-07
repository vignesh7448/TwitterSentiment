package polarity;

import java.util.HashSet;
import java.util.Set;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import hdfs.HDFSConnection;

public class PolarityDriver {
	public static Set<String> goodWords = new HashSet<String>();
	public static Set<String> badWords = new HashSet<String>();
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		Polarity pol = new Polarity();
		
		FileSystem fs = HDFSConnection.getConnection();
		Path path = new Path("hdfs://localhost:9000/tweetclassify");
		if(fs.exists(path)) {
			fs.delete(path);
		}
		
		Job job = new Job(conf, "polarity");
		pol.positiveList("hdfs://localhost:9000/pos/pos.txt"); // Path to positive words file
		pol.negativeList("hdfs://localhost:9000/neg/neg.txt"); // Path to negative words file
		Path in = new Path("hdfs://localhost:9000/removestop/tweet-m-00000");
		Path out = new Path("hdfs://localhost:9000/tweetclassify");
		FileInputFormat.setInputPaths(job, in);
		FileOutputFormat.setOutputPath(job, out);

		job.setJobName("MyJob");
		job.setMapperClass(PolarityMapper.class);
		job.setReducerClass(PolarityReducer.class);

		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);

		if (!job.waitForCompletion(true))
			return;
	}

}
