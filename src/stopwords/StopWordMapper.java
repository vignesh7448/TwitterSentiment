package stopwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;
import org.apache.hadoop.mapreduce.Mapper;
import hdfs.HDFSConnection;

public class StopWordMapper extends Mapper<LongWritable, Text, Text, NullWritable> {

	private Text word = new Text();
	private Text key = new Text();
	private Set<String> stopWordList = new HashSet<String>();
	private BufferedReader fis;
	FileSystem fs = null;
	MultipleOutputs out;
	@SuppressWarnings("deprecation")
	protected void setup(Context context) throws java.io.IOException, InterruptedException {

		try {
			out = new MultipleOutputs(context);
			fs = HDFSConnection.getConnection();
			Path p = new Path("hdfs://localhost:9000/stopwords");
			FileSystem fs = HDFSConnection.getConnection();
			
			FileStatus fs1[] = fs.listStatus(p);
			for(FileStatus fs2 : fs1) {
				Path newPath = fs2.getPath();
			if(fs.exists(newPath)) {
				System.out.println("exitsxxxxxxxxxxxxxx");
				readStopWordFile(newPath);
			}
			if(p!=null) {
				
				System.out.println("okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
			}
			}
//
//			Path[] stopWordFiles = new Path[0];
//			stopWordFiles = context.getLocalCacheFiles();
//			System.out.println(stopWordFiles.toString());
//			if (stopWordFiles != null && stopWordFiles.length > 0) {
//				for (Path stopWordFile : stopWordFiles) {
//					System.out.println(stopWordFile.getName()+" hello");
//					
//				}
//			}
		} catch (Exception e) {
			System.err.println("Exception reading stop word file: " + e);

		}

	}

	private void readStopWordFile(Path stopWordFile) {
		try {
			fis = new BufferedReader(new InputStreamReader(fs.open(stopWordFile)));
			String stopWord = null;
			while ((stopWord = fis.readLine()) != null) {
				System.out.println(stopWord+"  stp");
				stopWordList.add(stopWord);
			}
		} catch (IOException ioe) {
			System.err.println("Exception while reading stop word file '" + stopWordFile + "' : " + ioe.toString());
		}
	}

	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		try{FileSplit fileSplit = (FileSplit)context.getInputSplit();
		String filename = fileSplit.getPath().getName();
		String line = value.toString();
		System.out.println(filename+" lksjflsdfjlsdfjlsdf");
		StringTokenizer tokenizer = new StringTokenizer(line);
		System.out.println(stopWordList+" hhhhhhhhhhhhhhhhhhhhhhh");
		
		String line1 [] = line.split("\t\t");
		String line2[] = line1[2].split(" ");
		String val ="";
		for(String token :line2 ) {
			if (stopWordList.contains(token.toLowerCase().trim())) {
				context.getCounter(StopWordDriver.COUNTERS.STOPWORDS)
						.increment(1L);
			} else {
				context.getCounter(StopWordDriver.COUNTERS.GOODWORDS)
						.increment(1L);
				this.key.set(line1[0]+"\t\t"+line1[1]);
				
				val+= token.trim();
				val+=" ";
				
			}
		}
		if(val!=null && val!="") {
			word.set(val.replace("\t", " ").trim());
			out.write(this.key, word,filename);
		}
		
/*		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (stopWordList.contains(token)) {
				context.getCounter(StopWordDriver.COUNTERS.STOPWORDS)
						.increment(1L);
			} else {
				context.getCounter(StopWordDriver.COUNTERS.GOODWORDS)
						.increment(1L);
				word.set(token);
				out.write(word, null,filename);
			}
		}*/
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	@Override
	public void cleanup(Context con) {
		try {
			
			out.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
