//Finding sum of digits of a number until sum becomes single digit
//If a number n is divisible by 9, then the sum of its digit until sum becomes single digit is always 9

package leetcode;

public class Problem_258 {
	
	private static int digSum(int n) {
		if(n == 0)
			return 0;
		return (n % 9 == 0) ? 9 : n % 9;
	}
	
	public static void main (String[] args)
    {
        int n = 9998;
        System.out.println(digSum(n));
    }
}
