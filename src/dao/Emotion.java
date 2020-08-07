package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import hdfs.HDFSConnection;

public class Emotion {
	public static ArrayList<String> emotions() throws IOException {
		ArrayList<String> al = new ArrayList<>();
		int n1 = 0, c = 0;
		int v = 1;
		StringBuffer sb=null;
		Path path = new Path("hdfs://localhost:9000/tweets/tweet");
		FileSystem fs = HDFSConnection.getConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(path)));
		String line = "";
		String line1 = "";
		String content = "";
		sb = new StringBuffer();
		while ((line1 = br.readLine()) != null) {
			
			try {
			String newLine[] = line1.split("\t\t");
			System.out.println(line + "lfdslfj");
			String s1 = "";
			String ss1 = "";
			line = newLine[2];
			if (line.contains("#:-)")) {
				int n = 0;				
				String spl[] = newLine[2].split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("#:-)")) {
						spl[i] = spl[i].replace("#:-)", "Smiling with a fur hat");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("%-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("%-)")) {
						spl[i] = spl[i].replace("%-)", "Confused or merry");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("%-(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("%-(")) {
						spl[i] = spl[i].replace("%-(", "Confused and unhappy");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("%-}")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("%-}")) {
						spl[i] = spl[i].replace("%-}", "Intoxicated");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("%-6")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("%-6")) {
						spl[i] = spl[i].replace("%-6", "Not very clever");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("&:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("&:-)")) {
						spl[i] = spl[i].replace("&:-)", "Smiling with curls");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(-:")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(-:")) {
						spl[i] = spl[i].replace("(-:", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(:-)")) {
						spl[i] = spl[i].replace("(:-)", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(:::X:::)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(:::X:::)")) {
						spl[i] = spl[i].replace("(:::X:::)", "Plaster / Elastoplast");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("*<|:o)>")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("*<|:o)>")) {
						spl[i] = spl[i].replace("*<|:o)>", "Santa Claus");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("/: - |")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("/: - |")) {
						spl[i] = spl[i].replace("/: - |", "Unamused, mildly cross");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(": - )ï¿½")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(": - )ï¿½")) {
						spl[i] = spl[i].replace(": - )ï¿½", "Drooling");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-7")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-7")) {
						spl[i] = spl[i].replace(":-7", "Smirk");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-D")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-D")) {
						spl[i] = spl[i].replace(":-D", "Grinning");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-P")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-P")) {
						spl[i] = spl[i].replace(":-P", "Sticking tongue out");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":' )")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":' )")) {
						spl[i] = spl[i].replace(":' )", "Happy and crying");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(": @")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(": @")) {
						spl[i] = spl[i].replace(": @", "Shouting");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-#")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-#")) {
						spl[i] = spl[i].replace(":-#", "Razes");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":( Sad,")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":( Sad,")) {
						spl[i] = spl[i].replace(":( Sad,", "without nose");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":'-(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":'-(")) {
						spl[i] = spl[i].replace(":'-(", "Crying");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-(")) {
						spl[i] = spl[i].replace(":-(", "Sad");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-( )")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-( )")) {
						spl[i] = spl[i].replace(":-( )", "Shocked");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-(0)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-(0)")) {
						spl[i] = spl[i].replace(":-(0)", "Shouting");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":)")) {
						spl[i] = spl[i].replace(":)", "Smiling without a nose");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-)")) {
						spl[i] = spl[i].replace(":-)", "Smiling");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("-:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("-:-)")) {
						spl[i] = spl[i].replace("-:-)", "Punk");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-)=")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-)=")) {
						spl[i] = spl[i].replace(":-)=", "Smiling with a beard");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-)8")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-)8")) {
						spl[i] = spl[i].replace(":-)8", "Smiling with bow tie");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-*")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-*")) {
						spl[i] = spl[i].replace(":-*", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-*")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-*")) {
						spl[i] = spl[i].replace(":-*", "Kiss");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-?")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-?")) {
						spl[i] = spl[i].replace(":-?", "Smoking a pipe");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			// else if(line.contains( ":-\" ))
			// {
			// int n=0;
			// String spl[]=line.split(" ");
			// for(int i=0;i<spl.length;i++)
			// {
			// if(spl[i].contains( ":-\" ))
			// {
			// spl[i]=spl[i].replace( ":-\" , "Sceptical" );
			// }
			// if(n==0)
			// {
			// s1=spl[i];
			// }
			// else
			// {
			// s1=s1.concat(" ").concat(spl[i]);
			// }
			// n=n+1;
			// }
			// }
			if (line.contains(":^)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":^)")) {
						spl[i] = spl[i].replace(":^)", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-{)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-{)")) {
						spl[i] = spl[i].replace(":-{)", "With a moustache");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-{}")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-{}")) {
						spl[i] = spl[i].replace(":-{}", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-|")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-|")) {
						spl[i] = spl[i].replace(":-|", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-|/:-I")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-|/:-I")) {
						spl[i] = spl[i].replace(":-|/:-I", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-||")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-||")) {
						spl[i] = spl[i].replace(":-||", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-~)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-~)")) {
						spl[i] = spl[i].replace(":-~)", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":ï¿½-(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":ï¿½-(")) {
						spl[i] = spl[i].replace(":ï¿½-(", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":ï¿½-D")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":ï¿½-D")) {
						spl[i] = spl[i].replace(":ï¿½-D", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-<")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-<")) {
						spl[i] = spl[i].replace(":-<", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-<>")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-<>")) {
						spl[i] = spl[i].replace(":-<>", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":=)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":=)")) {
						spl[i] = spl[i].replace(":=)", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-0 hbtu 0-:")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-0 hbtu 0-:")) {
						spl[i] = spl[i].replace(":-0 hbtu 0-:", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-9")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-9")) {
						spl[i] = spl[i].replace(":-9", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-c")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-c")) {
						spl[i] = spl[i].replace(":-c", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-D")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-D")) {
						spl[i] = spl[i].replace(":-D", "Laugher");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-E")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-E")) {
						spl[i] = spl[i].replace(":-E", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-o")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-o")) {
						spl[i] = spl[i].replace(":-o", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-O")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-O")) {
						spl[i] = spl[i].replace(":-O", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-o")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-o")) {
						spl[i] = spl[i].replace(":-o", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-v")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-v")) {
						spl[i] = spl[i].replace(":-v", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-w")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-w")) {
						spl[i] = spl[i].replace(":-w", "Talking with two tongues");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-x")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-x")) {
						spl[i] = spl[i].replace(":-x", "Small Kiss");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-X")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-X")) {
						spl[i] = spl[i].replace(":-X", "Biggy sloppy kiss");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-X")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-X")) {
						spl[i] = spl[i].replace(":-X", "Not saying a word");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(";)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(";)")) {
						spl[i] = spl[i].replace(";)", "Twinkle (Wink), without nose");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(";-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(";-)")) {
						spl[i] = spl[i].replace(";-)", "Twinkle (Wink)");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("@:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("@:-)")) {
						spl[i] = spl[i].replace("@:-)", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("@WRK")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("@WRK")) {
						spl[i] = spl[i].replace("@WRK", "At work");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("[:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("[:-)")) {
						spl[i] = spl[i].replace("[:-)", "Smiling with walkman");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("[:]")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("[:]")) {
						spl[i] = spl[i].replace("[:]", "A Robot");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("{:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("{:-)")) {
						spl[i] = spl[i].replace("{:-)", "Toupee");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("{:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("{:-)")) {
						spl[i] = spl[i].replace("{:-)", "Smiling with hair");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("|:-[|]")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("|:-[|]")) {
						spl[i] = spl[i].replace("|:-[|]", "Mick Jagger");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("|-I")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("|-I")) {
						spl[i] = spl[i].replace("|-I", "Sleeping");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("|-O")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("|-O")) {
						spl[i] = spl[i].replace("|-O", "Snoring");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("}:-(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("}:-(")) {
						spl[i] = spl[i].replace("}:-(", "Toupee blowing in the wind");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("<:-|")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("<:-|")) {
						spl[i] = spl[i].replace("<:-|", "Monk / Nun");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("<|-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("<|-)")) {
						spl[i] = spl[i].replace("<|-)", "Chinese");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("<3")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("<3")) {
						spl[i] = spl[i].replace("<3", "A love heart");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("<3X")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("<3X")) {
						spl[i] = spl[i].replace("<3X", "Love heart and Kiss");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("=|:-)=")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("=|:-)=")) {
						spl[i] = spl[i].replace("=|:-)=", "Uncle Sam");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(">: - (")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(">: - (")) {
						spl[i] = spl[i].replace(">: - (", "Angry, yet sad");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(">: -|")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(">: -|")) {
						spl[i] = spl[i].replace(">: -|", "Cross");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(">:-(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(">:-(")) {
						spl[i] = spl[i].replace(">:-(", "Very angry");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(">:-@!")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(">:-@!")) {
						spl[i] = spl[i].replace(">:-@!", "Angry and swearing");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(">@@@@8^)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(">@@@@8^)")) {
						spl[i] = spl[i].replace(">@@@@8^)", "Marge Simpson");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("><:>")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("><:>")) {
						spl[i] = spl[i].replace("><:>", "A Turkey");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(">8-D")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(">8-D")) {
						spl[i] = spl[i].replace(">8-D", "Evil crazed laughter");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-<")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-<")) {
						spl[i] = spl[i].replace(":-<", "Super sad");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":P")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":P")) {
						spl[i] = spl[i].replace(":P", "Sticking tongue out (raspberry)");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-O")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-O")) {
						spl[i] = spl[i].replace(":-O", "Surprised");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-*")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-*")) {
						spl[i] = spl[i].replace(":-*", "Kissing");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-@")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-@")) {
						spl[i] = spl[i].replace(":-@", "Angry");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-$")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-$")) {
						spl[i] = spl[i].replace(":-$", "Confused");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			// else if(line.contains( ":-\" ))
			// {
			// int n=0;
			// String spl[]=line.split(" ");
			// for(int i=0;i<spl.length;i++)
			// {
			// if(spl[i].contains( ":-\" ))
			// {
			// spl[i]=spl[i].replace( ":-\" , "Shifty" );
			// }
			// if(n==0)
			// {
			// s1=spl[i];
			// }
			// else
			// {
			// s1=s1.concat(" ").concat(spl[i]);
			// }
			// n=n+1;
			// }
			// }
			if (line.contains(":-#")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-#")) {
						spl[i] = spl[i].replace(":-#", "Don't tell/secret");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":^)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":^)")) {
						spl[i] = spl[i].replace(":^)", "A broken nose");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-&")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-&")) {
						spl[i] = spl[i].replace(":-&", "tongue tied");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("E-:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("E-:-)")) {
						spl[i] = spl[i].replace("E-:-)", "a Ham radio operator");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("<:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("<:-)")) {
						spl[i] = spl[i].replace("<:-)", "Uni-brow");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":->")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":->")) {
						spl[i] = spl[i].replace(":->", "Big grin happy");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(-}{-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(-}{-)")) {
						spl[i] = spl[i].replace("(-}{-)", "Couple kissing");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-Q")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-Q")) {
						spl[i] = spl[i].replace(":-Q", "Smoking");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("$_$")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("$_$")) {
						spl[i] = spl[i].replace("$_$", "Greedy");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("@@")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("@@")) {
						spl[i] = spl[i].replace("@@", "Rolling your eyes");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-!")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-!")) {
						spl[i] = spl[i].replace(":-!", "Foot in mouth");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-D")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-D")) {
						spl[i] = spl[i].replace(":-D", "Laughter");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":*)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":*)")) {
						spl[i] = spl[i].replace(":*)", "Drunk smile");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":@")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":@")) {
						spl[i] = spl[i].replace(":@", "Exclamation What???");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-@")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-@")) {
						spl[i] = spl[i].replace(":-@", "Scream");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-0")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-0")) {
						spl[i] = spl[i].replace(":-0", "Yell");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-----)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-----)")) {
						spl[i] = spl[i].replace(":-----)", "Long nose (Liar!)");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("%-(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("%-(")) {
						spl[i] = spl[i].replace("%-(", "Confused");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-.)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-.)")) {
						spl[i] = spl[i].replace(":-.)", "Madonna");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-($)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-($)")) {
						spl[i] = spl[i].replace(":-($)", "Put your money where your mouth is");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(:I")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(:I")) {
						spl[i] = spl[i].replace("(:I", "An egghead");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("|-O")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("|-O")) {
						spl[i] = spl[i].replace("|-O", "Yawning");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":@)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":@)")) {
						spl[i] = spl[i].replace(":@)", "Pig smile");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("<(-_-)>")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("<(-_-)>")) {
						spl[i] = spl[i].replace("<(-_-)>", "Robot");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("d[-_-]b")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("d[-_-]b")) {
						spl[i] = spl[i].replace("d[-_-]b", "DJ with headphones");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("~:0")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("~:0")) {
						spl[i] = spl[i].replace("~:0", "Baby");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("-@--@-")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("-@--@-")) {
						spl[i] = spl[i].replace("-@--@-", "Eyeglasses");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			// else if(line.contains( "\VVV/" ))
			// {
			// int n=0;
			// String spl[]=line.split(" ");
			// for(int i=0;i<spl.length;i++)
			// {
			// if(spl[i].contains( "\VVV/" ))
			// {
			// spl[i]=spl[i].replace( "\VVV/" , "King" );
			// }
			// if(n==0)
			// {
			// s1=spl[i];
			// }
			// else
			// {
			// s1=s1.concat(" ").concat(spl[i]);
			// }
			// n=n+1;
			// }
			// }
			// else if(line.contains( "\%%%/" ))
			// {
			// int n=0;
			// String spl[]=line.split(" ");
			// for(int i=0;i<spl.length;i++)
			// {
			// if(spl[i].contains( "\%%%/" ))
			// {
			// spl[i]=spl[i].replace( "\%%%/" , "Queen" );
			// }
			// if(n==0)
			// {
			// s1=spl[i];
			// }
			// else
			// {
			// s1=s1.concat(" ").concat(spl[i]);
			// }
			// n=n+1;
			// }
			// }
			if (line.contains(":-#")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-#")) {
						spl[i] = spl[i].replace(":-#", "With braces");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":'-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":'-)")) {
						spl[i] = spl[i].replace(":'-)", "Happy Crying");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("{:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("{:-)")) {
						spl[i] = spl[i].replace("{:-)", "Toupee smile");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(";)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(";)")) {
						spl[i] = spl[i].replace(";)", "Winking smile");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(";-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(";-)")) {
						spl[i] = spl[i].replace(";-)", "Winking smile with nose");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("O:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("O:-)")) {
						spl[i] = spl[i].replace("O:-)", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("O*-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("O*-)")) {
						spl[i] = spl[i].replace("O*-)", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("|-O")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("|-O")) {
						spl[i] = spl[i].replace("|-O", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(:-D")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(:-D")) {
						spl[i] = spl[i].replace("(:-D", "");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("@>--;--")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("@>--;--")) {
						spl[i] = spl[i].replace("@>--;--", "Rose");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("@-}---")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("@-}---")) {
						spl[i] = spl[i].replace("@-}---", "Rose");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("=^.^=")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("=^.^=")) {
						spl[i] = spl[i].replace("=^.^=", "Cat");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("O.o")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("O.o")) {
						spl[i] = spl[i].replace("O.o", "Confused");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}

			// else if(line.contains( "*_*) (*_*; (+_+) (@_@) (@_@? (@_@;)
			// \(?o?)/!" ))
			// {
			// int n=0;
			// String spl[]=line.split(" ");
			// for(int i=0;i<spl.length;i++)
			// {
			// if(spl[i].contains( "*_*) (*_*; (+_+) (@_@) (@_@? (@_@;)
			// \(?o?)/!" ))
			// {
			// spl[i]=spl[i].replace( "*_*) (*_*; (+_+) (@_@) (@_@? (@_@;)
			// \(?o?)/!" , "Amazed" );
			// }
			// if(n==0)
			// {
			// s1=spl[i];
			// }
			// else
			// {
			// s1=s1.concat(" ").concat(spl[i]);
			// }
			// n=n+1;
			// }
			// }
			if (line.contains("O:-) 0:-3 0:3 0:-) 0:) 0;^)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("O:-) 0:-3 0:3 0:-) 0:) 0;^)")) {
						spl[i] = spl[i].replace("O:-) 0:-3 0:3 0:-) 0:) 0;^)", "Angel");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-|| :@ >:(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-|| :@ >:(")) {
						spl[i] = spl[i].replace(":-|| :@ >:(", "Angry");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":@ :-@ :=@ x( x-( x=( X( X- (X=(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":@ :-@ :=@ x( x-( x=( X( X- (X=(")) {
						spl[i] = spl[i].replace(":@ :-@ :=@ x( x-( x=( X( X- (X=(", "Angry");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(';')")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(';')")) {
						spl[i] = spl[i].replace("(';')", "Baby");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("?~*")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("?~*")) {
						spl[i] = spl[i].replace("?~*", "Bomb");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(".?o? ?o?.")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(".?o? ?o?.")) {
						spl[i] = spl[i].replace(".?o? ?o?.", "Bubbles");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(^) (cake)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(^) (cake)")) {
						spl[i] = spl[i].replace("(^) (cake)", "Cake");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(=^ï¿½^=) (=^ï¿½ï¿½^=) =^_^=")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(=^ï¿½^=) (=^ï¿½ï¿½^=) =^_^=")) {
						spl[i] = spl[i].replace("(=^ï¿½^=) (=^ï¿½ï¿½^=) =^_^=", "Cat");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":P :=P :-P :p :=p :-p")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":P :=P :-P :p :=p :-p")) {
						spl[i] = spl[i].replace(":P :=P :-P :p :=p :-p", "Cheeky");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("((+_+)) (+o+) (??) (?-?) (?.?) (?_?) (?_?>) (???)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("((+_+)) (+o+) (??) (?-?) (?.?) (?_?) (?_?>) (???)")) {
						spl[i] = spl[i].replace("((+_+)) (+o+) (??) (?-?) (?.?) (?_?) (?_?>) (???)", "Confused");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(ï¿½ï¿½? (?_?)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(ï¿½ï¿½? (?_?)")) {
						spl[i] = spl[i].replace("(ï¿½ï¿½? (?_?)", "Confusion");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("|;-) |-O")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("|;-) |-O")) {
						spl[i] = spl[i].replace("|;-) |-O", "Cool");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("8=) 8-) B=) B-) (cool)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("8=) 8-) B=) B-) (cool)")) {
						spl[i] = spl[i].replace("8=) 8-) B=) B-) (cool)", "Cool");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(";( ;-( ;=(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(";( ;-( ;=(")) {
						spl[i] = spl[i].replace(";( ;-( ;=(", "Crying");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":'-( :'(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":'-( :'(")) {
						spl[i] = spl[i].replace(":'-( :'(", "Crying");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("}:-) }:) 3:-) 3:)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("}:-) }:) 3:-) 3:)")) {
						spl[i] = spl[i].replace("}:-) }:) 3:-) 3:)", "Devilish");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(*?m?)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(*?m?)")) {
						spl[i] = spl[i].replace("(*?m?)", "Dissatisfied");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("%-) %)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("%-) %)")) {
						spl[i] = spl[i].replace("%-) %)", "Drunk,");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("|( |-( |=(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("|( |-( |=(")) {
						spl[i] = spl[i].replace("|( |-( |=(", "Dull");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("<:-|")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("<:-|")) {
						spl[i] = spl[i].replace("<:-|", "Dumb, dunce-like");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":$")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":$")) {
						spl[i] = spl[i].replace(":$", "Embarrassed");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(">:) >;) >:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(">:) >;) >:-)")) {
						spl[i] = spl[i].replace(">:) >;) >:-)", "Evil");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("]:) >:) (grin)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("]:) >:) (grin)")) {
						spl[i] = spl[i].replace("]:) >:) (grin)", "Evil grin");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			// else if(line.contains( "\(~o~)/ \(^o^)/ \(-o-)/ ?(^?^)?
			// ?(^o^)? (*^0^*)" ))
			// {
			// int n=0;
			// String spl[]=line.split(" ");
			// for(int i=0;i<spl.length;i++)
			// {
			// if(spl[i].contains( "\(~o~)/ \(^o^)/ \(-o-)/ ?(^?^)? ?(^o^)?
			// (*^0^*)" ))
			// {
			// spl[i]=spl[i].replace( "\(~o~)/ \(^o^)/ \(-o-)/ ?(^?^)?
			// ?(^o^)? (*^0^*)" , "Excited" );
			// }
			// if(n==0)
			// {
			// s1=spl[i];
			// }
			// else
			// {
			// s1=s1.concat(" ").concat(spl[i]);
			// }
			// n=n+1;
			// }
			// }
			if (line.contains("(^0_0^)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(^0_0^)")) {
						spl[i] = spl[i].replace("(^0_0^)", "Eyeglasses");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("<*)))-{ ><(((*> ><>")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("<*)))-{ ><(((*> ><>")) {
						spl[i] = spl[i].replace("<*)))-{ ><(((*> ><>", "Fis");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(">:[ :-( :( :-c :c :-< :?C :< :-[ :[ :{")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(">:[ :-( :( :-c :c :-< :?C :< :-[ :[ :{")) {
						spl[i] = spl[i].replace(">:[ :-( :( :-c :c :-< :?C :< :-[ :[ :{", "Frown");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(???)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(???)")) {
						spl[i] = spl[i].replace("(???)", "Grinning");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(?^o^?) (^v^) (^u^) (^?^) ( ^)o(^ ) (^O^) (^o^) (^?^) )^o^( (*^?^*) (????)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(?^o^?) (^v^) (^u^) (^?^) ( ^)o(^ ) (^O^) (^o^) (^?^) )^o^( (*^?^*) (????)")) {
						spl[i] = spl[i].replace(
								"(?^o^?) (^v^) (^u^) (^?^) ( ^)o(^ ) (^O^) (^o^) (^?^) )^o^( (*^?^*) (????)", "Happy");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("((d[-_-]b))")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("((d[-_-]b))")) {
						spl[i] = spl[i].replace("((d[-_-]b))", "Headphones");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("<3")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("<3")) {
						spl[i] = spl[i].replace("<3", "Heart and broken-heart (reverse-rotation)");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			// else if(line.contains( "o/\o ^5 >_>^ ^<_<" ))
			// {
			// int n=0;
			// String spl[]=line.split(" ");
			// for(int i=0;i<spl.length;i++)
			// {
			// if(spl[i].contains( "o/\o ^5 >_>^ ^<_<" ))
			// {
			// spl[i]=spl[i].replace( "o/\o ^5 >_>^ ^<_<" , "High five" );
			// }
			// if(n==0)
			// {
			// s1=spl[i];
			// }
			// else
			// {
			// s1=s1.concat(" ").concat(spl[i]);
			// }
			// n=n+1;
			// }
			// }
			if (line.contains("D:< D: D8 D; D= DX v.v D-':")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("D:< D: D8 D; D= DX v.v D-':")) {
						spl[i] = spl[i].replace("D:< D: D8 D; D= DX v.v D-':",
								"Horror, disgust, sadness, great dismay");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(*ï¿½?`*) (*ï¿½?ï¿½)=3")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(*ï¿½?`*) (*ï¿½?ï¿½)=3")) {
						spl[i] = spl[i].replace("(*ï¿½?`*) (*ï¿½?ï¿½)=3", "Infatuation");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(
					"^_^ (?o?) (^_^)/ (^O^)/ (^o^)/ (^^)/ (???)/ (/???)/ (^o^)? n( ï¿½?ï¿½)n ( ï¿½?ï¿½) ^?^")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(
							"^_^ (?o?) (^_^)/ (^O^)/ (^o^)/ (^^)/ (???)/ (/???)/ (^o^)? n( ï¿½?ï¿½)n ( ï¿½?ï¿½) ^?^")) {
						spl[i] = spl[i].replace(
								"^_^ (?o?) (^_^)/ (^O^)/ (^o^)/ (^^)/ (???)/ (/???)/ (^o^)? n( ï¿½?ï¿½)n ( ï¿½?ï¿½) ^?^",
								"Joyful");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":* :=* :-*")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":* :=* :-*")) {
						spl[i] = spl[i].replace(":* :=* :-*", "Kiss");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":* :^* ( '}{' )")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":* :^* ( '}{' )")) {
						spl[i] = spl[i].replace(":* :^* ( '}{' )", "Kiss, couple kissing");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":D :=D :-D :d :=d :-d")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":D :=D :-D :d :=d :-d")) {
						spl[i] = spl[i].replace(":D :=D :-D :d :=d :-d", "Laugh");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-D 8-D 8D x-D xD X-D XD =-D =D =-3 =3 B^D")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-D 8-D 8D x-D xD X-D XD =-D =D =-3 =3 B^D")) {
						spl[i] = spl[i].replace(":-D 8-D 8D x-D xD X-D XD =-D =D =-3 =3 B^D", "Laughing");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(*^^)v (^^)v (^_^)v (^?^) (ï¿½?ï¿½) ( ï¿½?`) (???) (^v^) (ï¿½-ï¿½*)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(*^^)v (^^)v (^_^)v (^?^) (ï¿½?ï¿½) ( ï¿½?`) (???) (^v^) (ï¿½-ï¿½*)")) {
						spl[i] = spl[i].replace("(*^^)v (^^)v (^_^)v (^?^) (ï¿½?ï¿½) ( ï¿½?`) (???) (^v^) (ï¿½-ï¿½*)",
								"Laughing, cheerful");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":x :-x: X :-X :# :-# :=x :=X :=#")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":x :-x: X :-X :# :-# :=x :=X :=#")) {
						spl[i] = spl[i].replace(":x :-x: X :-X :# :-# :=x :=X :=#", "Lips Sealed");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(..) (._.)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(..) (._.)")) {
						spl[i] = spl[i].replace("(..) (._.)", "Looking down");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			// else if(line.contains( "?(ï¿½?`)+ ï¿½\_(?)_/ï¿½" ))
			// {
			// int n=0;
			// String spl[]=line.split(" ");
			// for(int i=0;i<spl.length;i++)
			// {
			// if(spl[i].contains( "?(ï¿½?`)+ ï¿½\_(?)_/ï¿½" ))
			// {
			// spl[i]=spl[i].replace( "?(ï¿½?`)+ ï¿½\_(?)_/ï¿½" , "Mellow, shrug"
			// );
			// }
			// if(n==0)
			// {
			// s1=spl[i];
			// }
			// else
			// {
			// s1=s1.concat(" ").concat(spl[i]);
			// }
			// n=n+1;
			// }
			// }
			if (line.contains("8-| B-| 8| B| 8=| B=| (nerd)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("8-| B-| 8| B| 8=| B=| (nerd)")) {
						spl[i] = spl[i].replace("8-| B-| 8| B| 8=| B=| (nerd)", "Nerd");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(^^? (^_^;) (-_-;) (~_~;) (ï¿½?ï¿½;) (ï¿½_ï¿½;) (ï¿½ï¿½;) ^^; ^_^; (#^.^#) (^ ^;)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(
							"(^^? (^_^;) (-_-;) (~_~;) (ï¿½?ï¿½;) (ï¿½_ï¿½;) (ï¿½ï¿½;) ^^; ^_^; (#^.^#) (^ ^;)")) {
						spl[i] = spl[i].replace(
								"(^^? (^_^;) (-_-;) (~_~;) (ï¿½?ï¿½;) (ï¿½_ï¿½;) (ï¿½ï¿½;) ^^; ^_^; (#^.^#) (^ ^;)",
								"Nervous, embarrassed");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(*^?^*) ^_^ (#^.^#) (^-^)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(*^?^*) ^_^ (#^.^#) (^-^)")) {
						spl[i] = spl[i].replace("(*^?^*) ^_^ (#^.^#) (^-^)", "Normal laugh");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("C:??")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("C:??")) {
						spl[i] = spl[i].replace("C:??", "Octopus");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("#-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("#-)")) {
						spl[i] = spl[i].replace("#-)", "Partied all night");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("@}-;-'--- @>-->--")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("@}-;-'--- @>-->--")) {
						spl[i] = spl[i].replace("@}-;-'--- @>-->--", "Rose");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":( :=( :-(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":( :=( :-(")) {
						spl[i] = spl[i].replace(":( :=( :-(", "Sad");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(
					"('_') (/_;) (T_T) (;_;) (;_; (;_:) (;O;) (:_;) (ToT) (T?T) ;_; ;-; ;n; ;; Q.Q T.T QQ Q_Q")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(
							"('_') (/_;) (T_T) (;_;) (;_; (;_:) (;O;) (:_;) (ToT) (T?T) ;_; ;-; ;n; ;; Q.Q T.T QQ Q_Q")) {
						spl[i] = spl[i].replace(
								"('_') (/_;) (T_T) (;_;) (;_; (;_:) (;O;) (:_;) (ToT) (T?T) ;_; ;-; ;n; ;; Q.Q T.T QQ Q_Q",
								"Sad, crying");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("*<|:-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("*<|:-)")) {
						spl[i] = spl[i].replace("*<|:-)", "Santa Claus");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-X :X :-# :#")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-X :X :-# :#")) {
						spl[i] = spl[i].replace(":-X :X :-# :#", "Sealed lips or wearing braces");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(?_?)!! (-.-) (-_-) ( ??) (;?_?)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(?_?)!! (-.-) (-_-) ( ??) (;?_?)")) {
						spl[i] = spl[i].replace("(?_?)!! (-.-) (-_-) ( ??) (;?_?)", "Shame");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("( ? ??) (???)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("( ? ??) (???)")) {
						spl[i] = spl[i].replace("( ? ??) (???)", "Shocked, surprised");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("?? ??")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("?? ??")) {
						spl[i] = spl[i].replace("?? ??", "Shooting star");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			// else if(line.contains( ">:\ >:/ :-/ :-. :/ :\ =/ =\ :L =L :S
			// >.<" ))
			// {
			// int n=0;
			// String spl[]=line.split(" ");
			// for(int i=0;i<spl.length;i++)
			// {
			// if(spl[i].contains( ">:\ >:/ :-/ :-. :/ :\ =/ =\ :L =L :S
			// >.<" ))
			// {
			// spl[i]=spl[i].replace( ">:\ >:/ :-/ :-. :/ :\ =/ =\ :L =L :S
			// >.<" , "Skeptical, annoyed, undecided, uneasy" );
			// }
			// if(n==0)
			// {
			// s1=spl[i];
			// }
			// else
			// {
			// s1=s1.concat(" ").concat(spl[i]);
			// }
			// n=n+1;
			// }
			// }
			if (line.contains("(-_-)zzz")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(-_-)zzz")) {
						spl[i] = spl[i].replace("(-_-)zzz", "Sleeping");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("|-) I-) I=) (snooze)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("|-) I-) I=) (snooze)")) {
						spl[i] = spl[i].replace("|-) I-) I=) (snooze)", "Sleepy");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":) :=) :-)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":) :=) :-)")) {
						spl[i] = spl[i].replace(":) :=) :-)", "Smile");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-) :) :D :o) :] :3 :c) :> =] 8) =) :} :^) :?)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-) :) :D :o) :] :3 :c) :> =] 8) =) :} :^) :?)")) {
						spl[i] = spl[i].replace(":-) :) :D :o) :] :3 :c) :> =] 8) =) :} :^) :?)",
								"Smiley or happy face");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(^?^)y-.?o? (-?-)y-???")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(^?^)y-.?o? (-?-)y-???")) {
						spl[i] = spl[i].replace("(^?^)y-.?o? (-?-)y-???", "Smoking");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("~>?)~~~")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("~>?)~~~")) {
						spl[i] = spl[i].replace("~>?)~~~", "Snake");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(ï¿½???`) (ï¿½A`)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(ï¿½???`) (ï¿½A`)")) {
						spl[i] = spl[i].replace("(ï¿½???`) (ï¿½A`)", "Snubbed or deflated");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":| :=| :-|")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":| :=| :-|")) {
						spl[i] = spl[i].replace(":| :=| :-|", "Speechless");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(*)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(*)")) {
						spl[i] = spl[i].replace("(*)", "Star");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":| :-|")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":| :-|")) {
						spl[i] = spl[i].replace(":| :-|", "Straight face");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(".....f(ï¿½?ï¿½*)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(".....f(ï¿½?ï¿½*)")) {
						spl[i] = spl[i].replace(".....f(ï¿½?ï¿½*)", "Studying is good");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(">:O :-O :O :-o :o 8-0 O_O o-o O_o o_O o_o O-O")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(">:O :-O :O :-o :o 8-0 O_O o-o O_o o_O o_o O-O")) {
						spl[i] = spl[i].replace(">:O :-O :O :-o :o 8-0 O_O o-o O_o o_O o_o O-O", "Surprise");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":o :=o :-o :O :=O :-O")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":o :=o :-o :O :=O :-O")) {
						spl[i] = spl[i].replace(":o :=o :-o :O :=O :-O", "Surprised");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(???;)ï¿½oï¿½ ï¿½Oï¿½ :O o_O o_0 o.O (o.o)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(???;)ï¿½oï¿½ ï¿½Oï¿½ :O o_O o_0 o.O (o.o)")) {
						spl[i] = spl[i].replace("(???;)ï¿½oï¿½ ï¿½Oï¿½ :O o_O o_0 o.O (o.o)", "Surprised");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			// else if(line.contains( "(?ï¿½?ï¿½)?? ??? ---- ï¿½\_(?) ???
			// ??(`?ï¿½)?? ??? ---?( ï¿½ _ ï¿½?) (????)?????" ))
			// {
			// int n=0;
			// String spl[]=line.split(" ");
			// for(int i=0;i<spl.length;i++)
			// {
			// if(spl[i].contains( "(?ï¿½?ï¿½)?? ??? ---- ï¿½\_(?) ??? ??(`?ï¿½)??
			// ??? ---?( ï¿½ _ ï¿½?) (????)?????" ))
			// {
			// spl[i]=spl[i].replace( "(?ï¿½?ï¿½)?? ??? ---- ï¿½\_(?) ???
			// ??(`?ï¿½)?? ??? ---?( ï¿½ _ ï¿½?) (????)?????" , "Table flip" );
			// }
			// if(n==0)
			// {
			// s1=spl[i];
			// }
			// else
			// {
			// s1=s1.concat(" ").concat(spl[i]);
			// }
			// n=n+1;
			// }
			// }
			if (line.contains("(??)~")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(??)~")) {
						spl[i] = spl[i].replace("(??)~", "Tadpole");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":'-) :')")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":'-) :')")) {
						spl[i] = spl[i].replace(":'-) :')", "Tears of happiness");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(=_=)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(=_=)")) {
						spl[i] = spl[i].replace("(=_=)", "Tired");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(">:P :-P :P X-P x-p xp XP :-p :p =p :-ï¿½ :ï¿½ :ï¿½ :-ï¿½ :-b :b d:")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(">:P :-P :P X-P x-p xp XP :-p :p =p :-ï¿½ :ï¿½ :ï¿½ :-ï¿½ :-b :b d:")) {
						spl[i] = spl[i].replace(">:P :-P :P X-P x-p xp XP :-p :p =p :-ï¿½ :ï¿½ :ï¿½ :-ï¿½ :-b :b d:",
								"Tongue sticking out, cheeky/playful");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-J")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-J")) {
						spl[i] = spl[i].replace(":-J", "Tongue-in-cheek");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-& :&")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-& :&")) {
						spl[i] = spl[i].replace(":-& :&", "Tongue-tied");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(>_<) (>_<)>")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(>_<) (>_<)>")) {
						spl[i] = spl[i].replace("(>_<) (>_<)>", "Troubled");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":-))")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":-))")) {
						spl[i] = spl[i].replace(":-))", "Very happy or double chin");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(^^)/~~~ (^_^)/~ (;_;)/~~~ (^.^)/~~~ ($ï¿½ï¿½)/~~~ (@^^)/~~~ (T_T)/~~~ (ToT)/~~~")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(
							"(^^)/~~~ (^_^)/~ (;_;)/~~~ (^.^)/~~~ ($ï¿½ï¿½)/~~~ (@^^)/~~~ (T_T)/~~~ (ToT)/~~~")) {
						spl[i] = spl[i].replace(
								"(^^)/~~~ (^_^)/~ (;_;)/~~~ (^.^)/~~~ ($ï¿½ï¿½)/~~~ (@^^)/~~~ (T_T)/~~~ (ToT)/~~~",
								"Waving");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(";) ;-) ;=)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(";) ;-) ;=)")) {
						spl[i] = spl[i].replace(";) ;-) ;=)", "Wink");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("(^_-) (^_-)-?")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("(^_-) (^_-)-?")) {
						spl[i] = spl[i].replace("(^_-) (^_-)-?", "Wink");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(";-) ;) *-) *) ;-] ;] ;D ;^) :-,")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(";-) ;) *-) *) ;-] ;] ;D ;^) :-,")) {
						spl[i] = spl[i].replace(";-) ;) *-) *) ;-] ;] ;D ;^) :-,", "Wink face");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(";(")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(";(")) {
						spl[i] = spl[i].replace(";(", "Winky frowny");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":^)")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":^)")) {
						spl[i] = spl[i].replace(":^)", "Wondering");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains(":S :-S :=S :s :-s :=s")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains(":S :-S :=S :s :-s :=s")) {
						spl[i] = spl[i].replace(":S :-S :=S :s :-s :=s", "Worried");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("@")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("@")) {
						spl[i] = spl[i].replace("@", "AT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("1CE")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("1CE")) {
						spl[i] = spl[i].replace("1CE", "ONCE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("2D4")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("2D4")) {
						spl[i] = spl[i].replace("2D4", "TO DIE FOR");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("2L8")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("2L8")) {
						spl[i] = spl[i].replace("2L8", "TOO LATE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("2NITE")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("2NITE")) {
						spl[i] = spl[i].replace("2NITE", "TONIGHT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("2")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("2")) {
						spl[i] = spl[i].replace("2", "TO/TOO/TWO");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("4")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("4")) {
						spl[i] = spl[i].replace("4", "FOR/FOUR");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("6")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("6")) {
						spl[i] = spl[i].replace("6", "SIX");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("7")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("7")) {
						spl[i] = spl[i].replace("7", "SEVEN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("0")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("0")) {
						spl[i] = spl[i].replace("0", "ZERO");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("1")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("1")) {
						spl[i] = spl[i].replace("1", "ONE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("3")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("3")) {
						spl[i] = spl[i].replace("3", "THREE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("5")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("5")) {
						spl[i] = spl[i].replace("5", "FIVE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("8")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("8")) {
						spl[i] = spl[i].replace("8", "EIGHT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("9")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("9")) {
						spl[i] = spl[i].replace("9", "NINE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("2BCTND")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("2BCTND")) {
						spl[i] = spl[i].replace("2BCTND", "TO BE CONTINUED");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("2DAY")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("2DAY")) {
						spl[i] = spl[i].replace("2DAY", "TODAY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("2COOL4U")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("2COOL4U")) {
						spl[i] = spl[i].replace("2COOL4U", "TOO COOL FOR YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("2MOR,2MORO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("2MOR,2MORO")) {
						spl[i] = spl[i].replace("2MOR,2MORO", "TOMORROW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("2G4U")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("2G4U")) {
						spl[i] = spl[i].replace("2G4U", "TOO GOOD FOR YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("3SUM")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("3SUM")) {
						spl[i] = spl[i].replace("3SUM", "THREESOME");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("4YEO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("4YEO")) {
						spl[i] = spl[i].replace("4YEO", "FOR YOUR EYES ONLY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("4")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("4")) {
						spl[i] = spl[i].replace("4", "FOR");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("4E")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("4E")) {
						spl[i] = spl[i].replace("4E", "FOREVER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("4F?")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("4F?")) {
						spl[i] = spl[i].replace("4F?", "FOR FRIENDS?");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("911")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("911")) {
						spl[i] = spl[i].replace("911", "EMERGENCY, CALL ME");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("AFAIK")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("AFAIK")) {
						spl[i] = spl[i].replace("AFAIK", "AS FAR AS I KNOW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("ADD")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("ADD")) {
						spl[i] = spl[i].replace("ADD", "ADDRESS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("AKA")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("AKA")) {
						spl[i] = spl[i].replace("AKA", "ALSO KNOWN AS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("ATP")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("ATP")) {
						spl[i] = spl[i].replace("ATP", "ALL THE BEST");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("AFAIK")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("AFAIK")) {
						spl[i] = spl[i].replace("AFAIK", "AS FAR AS I KNOW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("ASAP")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("ASAP")) {
						spl[i] = spl[i].replace("ASAP", "AS SOON AS POSSIBLE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("AWHFY")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("AWHFY")) {
						spl[i] = spl[i].replace("AWHFY", "ARE WE HAVING FUN YET");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("AFK")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("AFK")) {
						spl[i] = spl[i].replace("AFK", "AWAY FROM KEYBOARD");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("ASAP")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("ASAP")) {
						spl[i] = spl[i].replace("ASAP", "AS SOON AS POSSIBLE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BAS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BAS")) {
						spl[i] = spl[i].replace("BAS", "BIG A SMILE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BBL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BBL")) {
						spl[i] = spl[i].replace("BBL", "BE BACK LATER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BBN")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BBN")) {
						spl[i] = spl[i].replace("BBN", "BYE BYE NOW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BBS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BBS")) {
						spl[i] = spl[i].replace("BBS", "BE BACK SOON");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BEG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BEG")) {
						spl[i] = spl[i].replace("BEG", "BIG EVIL GRIN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BF")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BF")) {
						spl[i] = spl[i].replace("BF", "BOYFRIEND");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BIBO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BIBO")) {
						spl[i] = spl[i].replace("BIBO", "BEER IN, BEER OUT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BRB")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BRB")) {
						spl[i] = spl[i].replace("BRB", "BE RIGHT BACK");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BTW")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BTW")) {
						spl[i] = spl[i].replace("BTW", "BY THE WAY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("B/C")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("B/C")) {
						spl[i] = spl[i].replace("B/C", "BECAUSE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BBC")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BBC")) {
						spl[i] = spl[i].replace("BBC", "BRING BEER AND CHIPS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BBL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BBL")) {
						spl[i] = spl[i].replace("BBL", "BE BACK LATER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BF")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BF")) {
						spl[i] = spl[i].replace("BF", "BOYFRIEND");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("BHL8")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BHL8")) {
						spl[i] = spl[i].replace("BHL8", "BE HOME LATE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("B4")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("B4")) {
						spl[i] = spl[i].replace("B4", "BEFORE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}
			if (line.contains("B4N")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("B4N")) {
						spl[i] = spl[i].replace("B4N", "BYE FOR NOW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("BCNU")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BCNU")) {
						spl[i] = spl[i].replace("BCNU", "BE SEEING' YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("B'DAY")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("B'DAY")) {
						spl[i] = spl[i].replace("B'DAY", "BIRTHDAY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("BG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BG")) {
						spl[i] = spl[i].replace("BG", "BIG GRIN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("BIL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BIL")) {
						spl[i] = spl[i].replace("BIL", "BOSS IS LISTENING");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("BTW")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BTW")) {
						spl[i] = spl[i].replace("BTW", "BY THE WAY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("BRB")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("BRB")) {
						spl[i] = spl[i].replace("BRB", "BE RIGHT BACK");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("C&G")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("C&G")) {
						spl[i] = spl[i].replace("C&G", "CHUCKLE AND GRIN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("CICO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("CICO")) {
						spl[i] = spl[i].replace("CICO", "COFFEE IN, COFFEE OUT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("CID")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("CID")) {
						spl[i] = spl[i].replace("CID", "CRYING IN DISGRACE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("CNP")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("CNP")) {
						spl[i] = spl[i].replace("CNP", "CONTINUED (IN MY) NEXT POST");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("CP")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("CP")) {
						spl[i] = spl[i].replace("CP", "CHAT POST");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("CRBT")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("CRBT")) {
						spl[i] = spl[i].replace("CRBT", "CRYING REAL BIG TEARS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("CSG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("CSG")) {
						spl[i] = spl[i].replace("CSG", "CHUCKLE SNICKER GRIN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("CYA")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("CYA")) {
						spl[i] = spl[i].replace("CYA", "SEE YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("CYAL8R")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("CYAL8R")) {
						spl[i] = spl[i].replace("CYAL8R", "SEE YOU LATER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("CM")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("CM")) {
						spl[i] = spl[i].replace("CM", "CALL ME");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("C U")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("C U")) {
						spl[i] = spl[i].replace("C U", "SEE YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("C")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("C")) {
						spl[i] = spl[i].replace("C", "SEE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("CID")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("CID")) {
						spl[i] = spl[i].replace("CID", "CONSIDER IT DONE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("COZ")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("COZ")) {
						spl[i] = spl[i].replace("COZ", "BECAUSE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("DK")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("DK")) {
						spl[i] = spl[i].replace("DK", "DON'T KNOW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("DYLM")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("DYLM")) {
						spl[i] = spl[i].replace("DYLM", "DO YOU LIKE ME");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("DLY")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("DLY")) {
						spl[i] = spl[i].replace("DLY", "I DON'T LIKE YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("EG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("EG")) {
						spl[i] = spl[i].replace("EG", "EVIL GRIN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("EMSG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("EMSG")) {
						spl[i] = spl[i].replace("EMSG", "EMAIL MESSAGE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("E2EG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("E2EG")) {
						spl[i] = spl[i].replace("E2EG", "EAR TO EAR GRIN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("EZ")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("EZ")) {
						spl[i] = spl[i].replace("EZ", "EASY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("FC")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("FC")) {
						spl[i] = spl[i].replace("FC", "FINGERS CROSSED");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("F2T")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("F2T")) {
						spl[i] = spl[i].replace("F2T", "FREE TO TALK");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("FTBOMH")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("FTBOMH")) {
						spl[i] = spl[i].replace("FTBOMH", "FROM THE BOTTOM OF MY HEART");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("FYI")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("FYI")) {
						spl[i] = spl[i].replace("FYI", "FOR YOUR INFORMATION");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("F2F")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("F2F")) {
						spl[i] = spl[i].replace("F2F", "FACE TO FACE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("FWIW")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("FWIW")) {
						spl[i] = spl[i].replace("FWIW", "FOR WHAT IT'S WORTH");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("GAL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("GAL")) {
						spl[i] = spl[i].replace("GAL", "GET A LIFE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("GF")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("GF")) {
						spl[i] = spl[i].replace("GF", "GIRLFRIEND");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("GFN")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("GFN")) {
						spl[i] = spl[i].replace("GFN", "GONE FOR NOW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("GMBA")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("GMBA")) {
						spl[i] = spl[i].replace("GMBA", "GIGGLING MY BUTT OFF");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("GMTA")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("GMTA")) {
						spl[i] = spl[i].replace("GMTA", "GREAT MINDS THINK ALIKE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("GTSY")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("GTSY")) {
						spl[i] = spl[i].replace("GTSY", "GLAD TO SEE YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("GAL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("GAL")) {
						spl[i] = spl[i].replace("GAL", "GET A LIFE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("GR8")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("GR8")) {
						spl[i] = spl[i].replace("GR8", "GREAT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("GUDLUK")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("GUDLUK")) {
						spl[i] = spl[i].replace("GUDLUK", "GOOD LUCK");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("H&K")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("H&K")) {
						spl[i] = spl[i].replace("H&K", "HUG AND KISS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("HABU")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("HABU")) {
						spl[i] = spl[i].replace("HABU", "HAVE A BETTER 'UN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("HAGN")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("HAGN")) {
						spl[i] = spl[i].replace("HAGN", "HAVE A GOOD NIGHT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("HAGU")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("HAGU")) {
						spl[i] = spl[i].replace("HAGU", "HAVE A GOOD 'UN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("HHIS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("HHIS")) {
						spl[i] = spl[i].replace("HHIS", "HANGING HEAD IN SHAME");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("HUB")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("HUB")) {
						spl[i] = spl[i].replace("HUB", "HEAD UP BUTT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IAE")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IAE")) {
						spl[i] = spl[i].replace("IAE", "IN ANY EVENT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IANAL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IANAL")) {
						spl[i] = spl[i].replace("IANAL", "I AM NOT A LAWYER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("H8")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("H8")) {
						spl[i] = spl[i].replace("H8", "HATE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("HBTU")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("HBTU")) {
						spl[i] = spl[i].replace("HBTU", "HAPPY BIRTHDAY TO YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("HOW R U")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("HOW R U")) {
						spl[i] = spl[i].replace("HOW R U", "HOW ARE YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IC")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IC")) {
						spl[i] = spl[i].replace("IC", "I SEE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IM2GUD4U")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IM2GUD4U")) {
						spl[i] = spl[i].replace("IM2GUD4U", "I'M TOO GOOD FOR YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IOU")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IOU")) {
						spl[i] = spl[i].replace("IOU", "I OWE YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("ITYS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("ITYS")) {
						spl[i] = spl[i].replace("ITYS", "I THINK YOU STINK");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IMI")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IMI")) {
						spl[i] = spl[i].replace("IMI", "I MEAN IT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IOW")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IOW")) {
						spl[i] = spl[i].replace("IOW", "IN OTHER WORDS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IMNSHO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IMNSHO")) {
						spl[i] = spl[i].replace("IMNSHO", "IN MY NOT SO HUMBLE OPINION");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IMO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IMO")) {
						spl[i] = spl[i].replace("IMO", "IN MY OPINION");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IMCO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IMCO")) {
						spl[i] = spl[i].replace("IMCO", "IN MY CONSIDERED OPINION");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IMHO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IMHO")) {
						spl[i] = spl[i].replace("IMHO", "IN MY HUMBLE OPINION");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IOW")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IOW")) {
						spl[i] = spl[i].replace("IOW", "IN OTHER WORDS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IRL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IRL")) {
						spl[i] = spl[i].replace("IRL", "IN REAL LIFE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("IWALU")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("IWALU")) {
						spl[i] = spl[i].replace("IWALU", "I WILL ALWAYS LOVE YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("JMO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("JMO")) {
						spl[i] = spl[i].replace("JMO", "JUST MY OPINION");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("JTLYK")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("JTLYK")) {
						spl[i] = spl[i].replace("JTLYK", "JUST TO LET YOU KNOW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("KIT")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("KIT")) {
						spl[i] = spl[i].replace("KIT", "KEEP IN TOUCH");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("K")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("K")) {
						spl[i] = spl[i].replace("K", "OKAY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("KC")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("KC")) {
						spl[i] = spl[i].replace("KC", "KEEP COOL");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("KWIM")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("KWIM")) {
						spl[i] = spl[i].replace("KWIM", "KNOW WHAT I MEAN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("KIT")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("KIT")) {
						spl[i] = spl[i].replace("KIT", "KEEP IN TOUCH");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("L8R")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("L8R")) {
						spl[i] = spl[i].replace("L8R", "LATER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("L8")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("L8")) {
						spl[i] = spl[i].replace("L8", "LATE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("L8R")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("L8R")) {
						spl[i] = spl[i].replace("L8R", "G8R LATER 'GATER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LHM")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LHM")) {
						spl[i] = spl[i].replace("LHM", "LORD HELP ME");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LHO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LHO")) {
						spl[i] = spl[i].replace("LHO", "LAUGHING HEAD OFF");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LHU")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LHU")) {
						spl[i] = spl[i].replace("LHU", "LORD HELP US");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LMAO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LMAO")) {
						spl[i] = spl[i].replace("LMAO", "LAUGHING MY A$$ OFF");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LMSO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LMSO")) {
						spl[i] = spl[i].replace("LMSO", "LAUGHING MY SOCKS OFF");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LOL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LOL")) {
						spl[i] = spl[i].replace("LOL", "LAUGH OUT LOUD/LOTS OF LOVE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LSHMBB")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LSHMBB")) {
						spl[i] = spl[i].replace("LSHMBB", "LAUGHING SO HARD MY BELLY IS BOUNCING");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LSHMBH")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LSHMBH")) {
						spl[i] = spl[i].replace("LSHMBH", "LAUGHING SO HARD MY BELLY HURTS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LTNS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LTNS")) {
						spl[i] = spl[i].replace("LTNS", "LONG TIME NO SEE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LTS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LTS")) {
						spl[i] = spl[i].replace("LTS", "LAUGHING TO SELF");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LUV")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LUV")) {
						spl[i] = spl[i].replace("LUV", "LOVE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LUWAMH")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LUWAMH")) {
						spl[i] = spl[i].replace("LUWAMH", "LOVE YOU WITH ALL MY HEART");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("LY")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("LY")) {
						spl[i] = spl[i].replace("LY", "LOVE YA");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("MTF")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("MTF")) {
						spl[i] = spl[i].replace("MTF", "MORE TO FOLLOW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("M8")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("M8")) {
						spl[i] = spl[i].replace("M8", "MATE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("MOB")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("MOB")) {
						spl[i] = spl[i].replace("MOB", "MOBILE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("MTG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("MTG")) {
						spl[i] = spl[i].replace("MTG", "MEETING");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("MC")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("MC")) {
						spl[i] = spl[i].replace("MC", "MERRY CHRISTMAS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("MSG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("MSG")) {
						spl[i] = spl[i].replace("MSG", "MESSAGE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("MTH")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("MTH")) {
						spl[i] = spl[i].replace("MTH", "MONTH");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("MYOB")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("MYOB")) {
						spl[i] = spl[i].replace("MYOB", "MIND YOUR OWN BUSINESS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NRN")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NRN")) {
						spl[i] = spl[i].replace("NRN", "NO REPLY NECESSARY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NADT")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NADT")) {
						spl[i] = spl[i].replace("NADT", "NOT A DARN THING");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("N CASE")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("N CASE")) {
						spl[i] = spl[i].replace("N CASE", "IN CASE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NA")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NA")) {
						spl[i] = spl[i].replace("NA", "NO ACCESS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NE")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NE")) {
						spl[i] = spl[i].replace("NE", "ANY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NETHING 2+?")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NETHING 2+?")) {
						spl[i] = spl[i].replace("NETHING 2+?", "ANYTHING TO ADD?");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NJOY")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NJOY")) {
						spl[i] = spl[i].replace("NJOY", "ENJOY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NP")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NP")) {
						spl[i] = spl[i].replace("NP", "NO PROBLEM");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("N")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("N")) {
						spl[i] = spl[i].replace("N", "AND");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("N/A")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("N/A")) {
						spl[i] = spl[i].replace("N/A", "NOT APPLICABLE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NC")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NC")) {
						spl[i] = spl[i].replace("NC", "NO COMMENT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NE1")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NE1")) {
						spl[i] = spl[i].replace("NE1", "ANYONE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NETHING")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NETHING")) {
						spl[i] = spl[i].replace("NETHING", "ANYTHING");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("NO1")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("NO1")) {
						spl[i] = spl[i].replace("NO1", "NO ONE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("OIC")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("OIC")) {
						spl[i] = spl[i].replace("OIC", "OH, I SEE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("OL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("OL")) {
						spl[i] = spl[i].replace("OL", "OLD LADY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("OM")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("OM")) {
						spl[i] = spl[i].replace("OM", "OLD MAN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("OTOH")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("OTOH")) {
						spl[i] = spl[i].replace("OTOH", "ON THE OTHER HAND");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("OTTOMH")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("OTTOMH")) {
						spl[i] = spl[i].replace("OTTOMH", "OFF THE TOP OF MY HEAD");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("PDS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("PDS")) {
						spl[i] = spl[i].replace("PDS", "PLEASE DON'T SHOOT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("PM")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("PM")) {
						spl[i] = spl[i].replace("PM", "PRIVATE MESSAGE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("PCM")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("PCM")) {
						spl[i] = spl[i].replace("PCM", "PLEASE CALL ME");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("PLZ")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("PLZ")) {
						spl[i] = spl[i].replace("PLZ", "PLEASE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("PPL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("PPL")) {
						spl[i] = spl[i].replace("PPL", "PEOPLE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("PLS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("PLS")) {
						spl[i] = spl[i].replace("PLS", "PLEASE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("PLZ 4GV ME")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("PLZ 4GV ME")) {
						spl[i] = spl[i].replace("PLZ 4GV ME", "PLEASE FORGIVE ME");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("PUKS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("PUKS")) {
						spl[i] = spl[i].replace("PUKS", "PICK UP KIDS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("POAHF")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("POAHF")) {
						spl[i] = spl[i].replace("POAHF", "PUT ON A HAPPY FACE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("QSL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("QSL")) {
						spl[i] = spl[i].replace("QSL", "REPLY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("QSO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("QSO")) {
						spl[i] = spl[i].replace("QSO", "CONVERSATION");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("QT")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("QT")) {
						spl[i] = spl[i].replace("QT", "CUTIE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("ROFL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("ROFL")) {
						spl[i] = spl[i].replace("ROFL", "ROLLING ON FLOOR LAUGHING");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("ROFLMAOAY")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("ROFLMAOAY")) {
						spl[i] = spl[i].replace("ROFLMAOAY", "ROFLMAO AT YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("ROFLMAOWTIME")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("ROFLMAOWTIME")) {
						spl[i] = spl[i].replace("ROFLMAOWTIME", "ROFLMAO WITH TEARS IN MY EYES");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("ROFLUTS ROFL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("ROFLUTS ROFL")) {
						spl[i] = spl[i].replace("ROFLUTS ROFL", "UNABLE TO SPEAK");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("R")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("R")) {
						spl[i] = spl[i].replace("R", "ARE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("RINGL8")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("RINGL8")) {
						spl[i] = spl[i].replace("RINGL8", "RUNNING LATE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("RU")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("RU")) {
						spl[i] = spl[i].replace("RU", "ARE YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("RU OK?")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("RU OK?")) {
						spl[i] = spl[i].replace("RU OK?", "ARE YOU OK?");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("RUOK")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("RUOK")) {
						spl[i] = spl[i].replace("RUOK", "ARE YOU OKAY?");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("RGDS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("RGDS")) {
						spl[i] = spl[i].replace("RGDS", "REGARDS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("RIP")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("RIP")) {
						spl[i] = spl[i].replace("RIP", "REST IN PEACE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("RU CMNG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("RU CMNG")) {
						spl[i] = spl[i].replace("RU CMNG", "ARE YOU COMING");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("SETE")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("SETE")) {
						spl[i] = spl[i].replace("SETE", "SMILING EAR TO EAR");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("SHID")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("SHID")) {
						spl[i] = spl[i].replace("SHID", "SLAPS HEAD IN DISGUST");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("SO")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("SO")) {
						spl[i] = spl[i].replace("SO", "SIGNIFICANT OTHER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("SOTMG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("SOTMG")) {
						spl[i] = spl[i].replace("SOTMG", "SHORT OF TIME MUST GO");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("SWL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("SWL")) {
						spl[i] = spl[i].replace("SWL", "SCREAMING WITH LAUGHTER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("SYS")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("SYS")) {
						spl[i] = spl[i].replace("SYS", "SEE YOU SOON");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("SC")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("SC")) {
						spl[i] = spl[i].replace("SC", "STAY COOL");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("SIT")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("SIT")) {
						spl[i] = spl[i].replace("SIT", "STAY IN TOUCH");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("SUM1")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("SUM1")) {
						spl[i] = spl[i].replace("SUM1", "SOMEONE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TA")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TA")) {
						spl[i] = spl[i].replace("TA", "THANKS AGAIN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TGIF")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TGIF")) {
						spl[i] = spl[i].replace("TGIF", "THANK GOD IT'S FRIDAY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TCOY")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TCOY")) {
						spl[i] = spl[i].replace("TCOY", "TAKE CARE OF YOURSELF");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TILII")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TILII")) {
						spl[i] = spl[i].replace("TILII", "TELL IT LIKE IT IS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TNT")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TNT")) {
						spl[i] = spl[i].replace("TNT", "TILL NEXT TIME");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TOY")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TOY")) {
						spl[i] = spl[i].replace("TOY", "THINKING OF YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("T+")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("T+")) {
						spl[i] = spl[i].replace("T+", "THINK POSITIVE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TC")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TC")) {
						spl[i] = spl[i].replace("TC", "TAKE CARE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("THNX")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("THNX")) {
						spl[i] = spl[i].replace("THNX", "THANKS");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TT4N")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TT4N")) {
						spl[i] = spl[i].replace("TT4N", "TA TA FOR NOW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TTFN")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TTFN")) {
						spl[i] = spl[i].replace("TTFN", "TA TA FOR NOW");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TTYL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TTYL")) {
						spl[i] = spl[i].replace("TTYL", "TALK TO YOU LATER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TALK 2U L8R")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TALK 2U L8R")) {
						spl[i] = spl[i].replace("TALK 2U L8R", "TALK TO YOU LATER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("TEL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("TEL")) {
						spl[i] = spl[i].replace("TEL", "TELEPHONE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("THANQ")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("THANQ")) {
						spl[i] = spl[i].replace("THANQ", "THANK YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("U")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("U")) {
						spl[i] = spl[i].replace("U", "YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("URA*")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("URA*")) {
						spl[i] = spl[i].replace("URA*", "YOU ARE A STAR");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("UR")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("UR")) {
						spl[i] = spl[i].replace("UR", "YOUR");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("URAQT")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("URAQT")) {
						spl[i] = spl[i].replace("URAQT", "YOU ARE A CUTIE");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("WB")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("WB")) {
						spl[i] = spl[i].replace("WB", "WELCOME BACK");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("W")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("W")) {
						spl[i] = spl[i].replace("W", "WITH");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("W4U")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("W4U")) {
						spl[i] = spl[i].replace("W4U", "WAITING FOR YOU");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("W8 4 ME")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("W8 4 ME")) {
						spl[i] = spl[i].replace("W8 4 ME", "WAIT FOR ME");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("WAN2")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("WAN2")) {
						spl[i] = spl[i].replace("WAN2", "WANT TO");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("WILL SPK 2 U L8R")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("WILL SPK 2 U L8R")) {
						spl[i] = spl[i].replace("WILL SPK 2 U L8R", "WILL SPEAK TO YOU LATER");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("WOT")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("WOT")) {
						spl[i] = spl[i].replace("WOT", "WHAT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("WU?")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("WU?")) {
						spl[i] = spl[i].replace("WU?", "WHAT'S UP?");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("W/O")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("W/O")) {
						spl[i] = spl[i].replace("W/O", "WITHOUT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("W8")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("W8")) {
						spl[i] = spl[i].replace("W8", "WAIT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("W8N")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("W8N")) {
						spl[i] = spl[i].replace("W8N", "WAITING");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("WAN2TLK")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("WAN2TLK")) {
						spl[i] = spl[i].replace("WAN2TLK", "WANT TO TALK?");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("WKND")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("WKND")) {
						spl[i] = spl[i].replace("WKND", "WEEKEND");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("WT")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("WT")) {
						spl[i] = spl[i].replace("WT", "WHAT");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("YG")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("YG")) {
						spl[i] = spl[i].replace("YG", "YOUNG GENTLEMAN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("YL")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("YL")) {
						spl[i] = spl[i].replace("YL", "YOUNG LADY");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			} else if (line.contains("YM")) {
				int n = 0;
				String spl[] = line.split(" ");
				for (int i = 0; i < spl.length; i++) {
					if (spl[i].contains("YM")) {
						spl[i] = spl[i].replace("YM", "YOUNG MAN");
					}
					if (n == 0) {
						s1 = spl[i];
					} else {
						s1 = s1.concat(" ").concat(spl[i]);
					}
					n = n + 1;
				}
			}

			if (s1 == null || s1 == "") {
				s1 = line;
			}

			n1 = n1 + 1;
			System.out.println(s1);
			sb.append(s1);
			sb.append("\n");
			ss1 = s1;
			String swr = ss1.replaceAll("[^A-Za-z]", " ").trim();
			String sswr = swr.replaceAll("[\\-\\+\\.\\^:,]", "").replaceAll("'", "");
			content = sswr;
			if(newLine.length>=3) {
				String output = newLine[0]+"\t\t"+newLine[1]+"\t\t"+content;
				al.add(output);
			}
			
			
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return al;
	}
	
}
