package leetcode;

import java.util.*;

class MagicalSequence {
	static List l = new ArrayList();
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	int n,d;
    	while(t-->0) {
    		n = sc.nextInt();
    		d = sc.nextInt();
    		
    		System.out.println(magicalSequences(n, d));
    	}

	}

	private static int magicalSequences(int n, int d) {
		if(n == 0)
			return 0;
		if(n == 1)
			return d%10 == 0? 1 : 0;
		int[] ch = new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			ch[i]=d%10;
			d /=10;
		}
		printSubArray(ch,0);
		for(int i=0;i<l.size();i++) {
			 sum+=checkMagicSequence((int[])l.get(i));
		}
		return sum;
		
	}

	public static void printSubArray(int [] input, int currIndex){

        if(currIndex==input.length)
            return;

        //print all the subarray from currIndex to end
        int[] result = new int[input.length];
        for (int i = currIndex; i <input.length ; i++) {
            result[i]=input[i];
            l.add(result);
//           
        }
        printSubArray(input, currIndex+1);
    }
	private static int checkMagicSequence(int[] ch){
		int n = ch.length;
		int sum=0;
		for(int i=1;i<n;i+=2) {
			ch[i]*=2;
			if(ch[i]-10>=0) {
				int b = ch[i];
				while(b!=0) {
					sum+=b%10;
					b /=10;
				}	
				ch[i] =sum;
				sum=0;
			}		
		}
		for(int i=0;i<n;i++) {
			sum+=ch[i];
		}
		return sum%10 == 0? 1:0;
	}

}
