package leetcode;
//EASY: https://leetcode.com/problems/count-binary-substrings/

public class CountBinarySubStrings {
	
	public int countBinarySubstrings(String s) {
		int[] groups = new int[s.length()];     //grouping count of same integers in a set together(0 or 1)
		int t =0;
		groups[0] = 1;
		for(int i=1;i<s.length();i++){          //counting no. of consicutive similar integers(0 or 1)
		   if(s.charAt(i) != s.charAt(i-1))
		      groups[++t]=1;                  //if current & previous are different: move forward for new set count
		   else
		      groups[t]++;                    //if current & previous are same: increase count for current position/integer(0 or 1)
		}
		t=0;
		for(int i=1;i<groups.length;i++)
			t+=Math.min(groups[i],groups[i-1]); //add the minimum of 2 groups: 
		                                        //since minimum would the count of the possible half length of a substring
		                                        //ex: 001110 -> groups={2,3,1} -> 
		                                        //min(2,3)=2; from 00111 possibilities are {0011,01} (2 '0's)&(1 '0'), 3'0's not possible
		                                        //min(2,1)=1; from 110 possibilites are {01} (1 '0')
		return t;
	}
}