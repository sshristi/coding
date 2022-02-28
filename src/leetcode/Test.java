package leetcode;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;

public class Test {
	
	class Debit{
		int amt;
		int count;
		Debit(int amt){
			this.amt = amt;
			this.count =1;
		}
	}
	public int solution(int[] A, String[] D) {
		int n = A.length;
		int balance = 0;
		int months = 12;
		Map<Integer, Debit> map = new HashMap<>();
		Queue q = new LinkedList();
		for(int i=0;i<n;i++) {
			if(A[i]< 0) {
				LocalDate td = LocalDate.parse(D[i]);
				int month = td.getMonthValue();
				if(map.containsKey(month)) {
					map.get(month).count++;
					map.get(month).amt+=Math.abs(A[i]);
				}else {
					Debit d = new Debit(Math.abs(A[i]));
					map.put(month, d);
				}
			}
			balance+=A[i];
			System.out.println(A[i]+"  "+balance);
		}
		
	
				for (Entry<Integer, Debit> entry : map.entrySet()) {
					if(entry.getValue().amt>=100 && entry.getValue().count>=3)
						months--;
					
				    System.out.println(entry.getKey() +  "/" + entry.getValue().amt + "/" + entry.getValue().count);
				}
				System.out.println(months +"  "+ balance);
        return balance-5*months;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		int[] A = {180, -50, -25, -25};
		String [] D = {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"};
		System.out.println(t.solution(A,D));
	}

}
