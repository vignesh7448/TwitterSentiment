package stopwords;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Counters;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.filecache.DistributedCache;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import hdfs.HDFSConnection;

@SuppressWarnings("deprecation")
public class StopWordDriver {

	public static String good;
	public static String stop;
	public enum COUNTERS {
		  STOPWORDS,
		  GOODWORDS
		 }
	
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		
		FileSystem fs = HDFSConnection.getConnection();
		
		Path path = new Path("hdfs://localhost:9000/removestop");
		if(fs.exists(path)) {
			fs.delete(path);
		}
		
		GenericOptionsParser parser = new GenericOptionsParser(conf, args);
		args = parser.getRemainingArgs();
		
		Job job = new Job(conf, "StopWordSkipper");
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		job.setJarByClass(StopWordDriver.class);
		job.setMapperClass(StopWordMapper.class);
		job.setNumReduceTasks(0);
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);

		List<String> other_args = new ArrayList<String>();
		// Logic to read the location of stop word file from the command line
		// The argument after -skip option will be taken as the location of stop
		// word file

//		for (int i = 0; i < args.length; i++) {
//			if ("-skip".equals(args[i])) {
				DistributedCache.addCacheFile(new Path("hdfs://localhost:9000/stopwords").toUri(), conf);
//				if (i+1 < args.length)
//				{
//					i++;
//				}
//				else
//				{
//					break;
//				}
//			}
			
//			other_args.add(args[i]);
//		}

		FileInputFormat.setInputPaths(job, new Path("hdfs://localhost:9000/emotiontweets"));
		FileOutputFormat.setOutputPath(job, new Path("hdfs://localhost:9000/removestop"));
		job.waitForCompletion(true);
		Counters counters = job.getCounters();
		 good = counters.findCounter(COUNTERS.GOODWORDS).getValue()+"";
		 stop = counters.findCounter(COUNTERS.STOPWORDS).getValue()+"";
		System.out.println(good);
		System.out.printf("Good Words: %d, Stop Words: %d\n",
			      counters.findCounter(COUNTERS.GOODWORDS).getValue(),
			      counters.findCounter(COUNTERS.STOPWORDS).getValue());
			 }
	}


