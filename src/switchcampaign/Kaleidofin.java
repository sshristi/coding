package switchcampaign;

import java.util.Set;
import java.util.TreeSet;

public class Kaleidofin {

	public static void main(String[] args) {
//		Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
//				For example,
//				Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
//				Given word1 = “coding”, word2 = “practice”, return 3.
//				Given word1 = "makes", word2 = "coding", return 1.
				    
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "makes", word2 = "coding";
		int result =shortestDistance(words, word1,word2);
		if(result !=-1)
			System.out.println(result);
		else
			System.out.println("word not found");
				     
	}

	private static int shortestDistance(String[] words, String w1, String w2) {
		TreeSet<Integer> me = new TreeSet<>();
		int m=-1,n=-1,dis=-1;
		for(int i =0;i<words.length;i++) {
			if(words[i].equals(w1)) {
				m=i;
				
			}else if(words[i].equals(w2))
				n=i;
			else
				continue;
			if(m==-1 || n==-1) {
				continue;
			}else {
				dis=Math.abs(m-n);
				me.add(dis);
			}
		}
		if(!me.isEmpty())
			return me.first();
		return -1;
	}

}
