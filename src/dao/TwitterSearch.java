package dao;

import java.util.ArrayList;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterSearch {

	static String hashTag = "#hi";
	static final int count = 10;
	static long sinceId = 0;
	static long numberOfTweets = 0;
	static StringBuilder sb1 = new StringBuilder();
	static ArrayList<String> al = new ArrayList<>(); 
	public static ArrayList<String> search(String tag) {
		hashTag = tag;
		StringBuilder sb = null;
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey("HJHVYbs7pvQVEtH8E677BkVuk")
				.setOAuthConsumerSecret("Zuc6SwE9Orc9vLjAIvwdd8JeacuLo2ug1m5WSm0S3lLOhX3y51")
				.setOAuthAccessToken("1086573160508473344-2ya4PI6vjrwCczCpemnxCzIIEuGT68")
				.setOAuthAccessTokenSecret("ym1oCTdgPSHn8AUweLMRrxN9jZTyiqlJQOscCspy4504l");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();

		// get latest tweets as of now
		// At this point store sinceId in database
		Query queryMax = new Query(hashTag);
		queryMax.setCount(count);
		sb = getTweets(queryMax, twitter, "maxId");
		queryMax = null;

		// get tweets that may have occurred while processing above data
		// Fetch sinceId from database and get tweets, also at this point store the
		// sinceId
		do {
			Query querySince = new Query(hashTag);
			querySince.setCount(count);
			querySince.setSinceId(sinceId);
			sb = getTweets(querySince, twitter, "sinceId");
			querySince = null;
		} while (checkIfSinceTweetsAreAvaliable(twitter));
		return al;
	}

	private static boolean checkIfSinceTweetsAreAvaliable(Twitter twitter) {
		Query query = new Query(hashTag);
		query.setCount(count);
		query.setSinceId(sinceId);
		try {
			QueryResult result = twitter.search(query);
			if (result.getTweets() == null || result.getTweets().isEmpty()) {
				query = null;
				return false;
			}
		} catch (TwitterException te) {
			System.out.println("Couldn't connect: " + te);
			System.exit(-1);
		} catch (Exception e) {
			System.out.println("Something went wrong: " + e);
			System.exit(-1);
		}
		return true;
	}

	private static StringBuilder getTweets(Query query, Twitter twitter, String mode) {
		boolean getTweets = true;
		long maxId = 0;
		long whileCount = 0;
		
		while (getTweets) {
			try {

				QueryResult result = twitter.search(query);
				if (result.getTweets() == null || result.getTweets().isEmpty()) {
					getTweets = false;
				} else {
					System.out.println("***********************************************");
					System.out.println("Gathered " + result.getTweets().size() + " tweets");
					int forCount = 0;
					for (Status status : result.getTweets()) {
						if (whileCount == 0 && forCount == 0) {
							sinceId = status.getId();// Store sinceId in database
							System.out.println("sinceId= " + sinceId);
						}
						System.out.println("Id= " + status.getId());
						System.out.println("@" + status.getUser().getScreenName() + " : " + status.getUser().getName()
								+ "--------" + status.getText());
						sb1.append(status.getUser().getScreenName() + "\t" + status.getCreatedAt().toGMTString() + "\t"
								+ status.getText());
						sb1.append("\n");
						String s = status.getUser().getScreenName() + "\t\t" + status.getCreatedAt().toGMTString() + "\t\t"
								+ status.getText();
						al.add(s);												
						if (forCount == result.getTweets().size() - 1) {
							maxId = status.getId();
							System.out.println("maxId= " + maxId);
						}
						System.out.println("");
						forCount++;
					}
					numberOfTweets = numberOfTweets + result.getTweets().size();
					query.setMaxId(maxId - 1);
				}
			} catch (TwitterException te) {
				getTweets =false;
				System.out.println("Couldn't connect: " + te);
				te.printStackTrace();
//				System.exit(-1);
			} catch (Exception e) {
				getTweets =false;
				System.out.println("Something went wrong: " + e);
//				System.exit(-1);
			}
			whileCount++;
			if(whileCount<100) {
				break;
			}
		}
		System.out.println("Total tweets count=======" + numberOfTweets);
		return sb1;
	}
}
