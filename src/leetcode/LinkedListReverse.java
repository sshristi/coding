package leetcode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class LinkedListReverse {

//	public static void main(String[] args) {
		// Reverse the singly linked list in one pass
		
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		
//		System.out.println(reverseList(list));
//	}
//
//	private static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
//		
//		return list;
//	}

	    /*
	     * Complete the function below.
	     */
	    static String findQualifiedNumbers(int[] numberArray) {
	        TreeSet<Integer> set = new TreeSet<>();
	        for(int num: numberArray){
	            if(contains123(Integer.toString(num)))
	                set.add(num);
	        }
	        StringBuffer result = new StringBuffer();
	        set.stream().forEach(e -> result.append(e + ","));
	        String finalResult = result.toString();
	        finalResult = finalResult.replaceAll(",$", "");
	        return result.length()>0 ? finalResult : "-1";
	    }
	    static boolean contains123(String num){
	        return (num.contains("1") && num.contains("2") && num.contains("3"));
	    }
	    public static void main(String[] args) throws IOException {
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = null;
	        if (fileName != null) {
	            bw = new BufferedWriter(new FileWriter(fileName));
	        }
	        else {
	            bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        }
	        String res;
	        int numberArray_size = 0;
	        numberArray_size = Integer.parseInt(in.nextLine().trim());

	        int[] numberArray = new int[numberArray_size];
	        for(int i = 0; i < numberArray_size; i++) {
	            int numberArray_item;
	            numberArray_item = Integer.parseInt(in.nextLine().trim());
	            numberArray[i] = numberArray_item;
	        }

	        res = findQualifiedNumbers(numberArray);
	        bw.write(res);
	        bw.newLine();

	        bw.close();
	    }
	}



