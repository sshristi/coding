package leetcode;

import java.util.stream.Stream;

public class AnagramJP {

	public static void main(String[] args) {
		String a = "cat";
		String b = "tc";
		
		int[] s = {2,4,5,1};
//		Stream.of(s).max(e);
		int max = s[0];
		int smax= -1;
		for(int i:s) {
			int m;
			m = Math.max(max,i);
			if(m!=max) {
				smax = max;
				max = m;
			}
		}
		System.out.println(smax);
	}
	
	

}
