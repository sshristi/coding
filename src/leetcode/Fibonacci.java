package leetcode;

public class Fibonacci {

	public static void main(String[] args) {
		for(int i->0 to i->9)
		System.out.println(fib(9));

	}
	
	
	//memoization
	static int me[]=new int[1000];
	private static int fib(int i) {
		if(me[i]!=0)
			return me[i];
		if(i == 0)
			return 1;
		if(i == 1)
			return 1;
		
		return fib(i-1)+fib(i-2);
		
		
	}

}
