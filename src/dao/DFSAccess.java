package dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import hdfs.HDFSConnection;

public class DFSAccess {
	static final String url = "hdfs://localhost:9000/tweets";
	static final String urlEmption = "hdfs://localhost:9000/emotiontweets";

	public static ArrayList<String> store(String file, ArrayList<String> sb) {
		ArrayList<String> sb2 = new ArrayList<>();
		try {
			StringBuilder builder = new StringBuilder();
			for(String s : sb) {
				builder.append(s);
				builder.append("\n");
				sb2.add(s);
			}
			
			FileSystem fs = HDFSConnection.getConnection();
			Path path = new Path(url);
			if (!fs.exists(path)) {
				fs.mkdirs(path);
			}
			FSDataOutputStream out = fs.create(new Path(url + "/" + "tweet"));
			out.writeBytes(builder.toString());
			out.close();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(new Path(url + "/" + "tweet"))));
			
			
			return sb2;

		} catch (Exception e) {
			System.out.println(e);
		}
		return sb2;
	}
	
	public static String writeEmotion(String file, ArrayList<String> sb) {

		try {
			StringBuilder builder = new StringBuilder();
			for(String s : sb) {
				builder.append(s);
				builder.append("\n");
			}
			
			FileSystem fs = HDFSConnection.getConnection();
			Path path = new Path(url);
			if (!fs.exists(path)) {
				fs.mkdirs(path);
			}
			FSDataOutputStream out = fs.create(new Path(urlEmption + "/" + "tweet"));
			out.writeBytes(builder.toString());
			out.close();
			return "Success";

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public static ArrayList<String> afterStopword() {
		ArrayList<String> al = new ArrayList<>();
		try {
			
			FileSystem fs = HDFSConnection.getConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(new Path("hdfs://localhost:9000/removestop/tweet-m-00000"))));
			String line = "";
			while((line=br.readLine())!=null) {
				String line1[] = line.split("\t\t");
				String line2[] = line1[1].split("\t");
				
				System.out.println(line1[0]+ "hello");
				al.add(line1[0]+"\t\t"+line2[0]+"\t\t"+line2[1]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
		
	}
}
