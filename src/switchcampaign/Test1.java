package switchcampaign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
//		String s = "asdsa";
//		int n = s.length();
//		for(int i=0,j=n-1; i<=j;i++, j--) {
//			if(s.charAt(i)!=s.charAt(j)) {
//				
//				System.out.println( "not a pallindrome");
//				return;
//			}
//		}
//		System.out.println("Given string is a pallindrome");
		
		
//		int [] arr = {1,2,4,5};
//		int f = arr[0];
//		for(int i=0;i<=arr.length-1;i++, f++) {
//			if(arr[i] != f ) {
//				System.out.println(f);
//				return;
//			}
//		}
//		System.out.println("no missing number");
		
//		String s = "(X+Y)*(Z-C)";
//		String output ="";
//		String op = "$[+-*/]^";
//		Stack<Character> stack = new Stack<>();
//		for(char c:s.toCharArray()) {
//			if(c == '(')
//				continue;
//			else if( c ==')') {
//				output+=stack.pop();
//			}	
//			else if(c == '+' || c == '*' || c == '-' || c == '/')
//				stack.push(c);
//			else
//				output += c;
//		}
//		if(!stack.isEmpty()) {
//			for(char c:stack)
//				output+=c;
//		}
//		System.out.println(output);
		
//		int [] arr = {1,2,4,5};
//		Arrays.asList(arr);
//		List<Integer> list = new ArrayList<>();
//		list.toArray();
		
		int n = 3, m =4;
		List<Integer> l = {1,4};
		System.out.println(countConnections(ma));
	}
	
	private static int countConnections(List<List<Integer>> matrix) {
		int rows = matrix.size();
		int columns = matrix.get(0).size();
	    //cartesian plane coordinates around a point
	    final int[] x = {1, 1, 1, -1, -1, -1, 0, 0};
	    final int[] y = {1, -1, 0, 1, -1, 0, 1, -1};
	    int count = 0;
	    boolean[][] visited = new boolean[rows][columns];
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < columns; j++) {
	            for (int k = 0; k < 8; k++) {
	                int l = i + x[k];
	                int m = j + y[k];
	                //check for connections only if the given cell has value 1
	                if (matrix.get(i).get(j) == 1 && canVisit(l, m, rows, columns, visited) && matrix.get(l).get(m) == 1) {
	                    count++;
	                }

	            }
	            visited[i][j] = true;
	        }
	    }
	    return count;
	}

	private static boolean canVisit(int i, int j, int rows, int columns, boolean [][] visited) {
	    return i < rows && j < columns && i >= 0 && j >= 0 && !visited[i][j];
	}

}

