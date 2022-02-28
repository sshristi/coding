package switchcampaign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PayPal {

	public static void main(String[] args) {
		// // Sample Input
		//Integer [] arr = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};

		// Sample Output
		// [0, 7]
//		Integer [] arr = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
//		List<Integer> list = Stream.of(arr).collect(Collectors.toList());
//		Collections.sort(list);
//		Map<Integer, List<Integer>> map = new HashMap<>();
//		int m,n,j=0;
//		m = list.get(0);
//		List<Integer> l =new ArrayList<>();
//		l.add(m);
//		map.put(++j,l);
//		
//		for(int i=1;i<list.size();i++) {
//			if(list.get(i) == m+1) {
//				l.add(m+1);
//				m++;
//				map.put(j, l);
//			}else {
//				l = new ArrayList<>();
//				m = list.get(i);
//				l.add(m);
//				map.put(++j, l);
//			}
//		}
//		int [] a = new int[2];
//		int max =0 ;
//		for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
//			 if(max<entry.getValue().size()) {
//				max = entry.getValue().size();
//				a[0] = entry.getValue().get(0);
//				a[1] = entry.getValue().get(max-1);
//			 }
//		}
//		
//		System.out.println("[" +a[0]+" " +a[1]+"]");
		
		
		
		
		
		long num = 138;
		long rev=0;
		
		while(num!=0) {
			long i = num%10;
			rev = rev*10 + i;
			num/=10;
		}
		System.out.println(rev);
		
//		System.out.println(reverse(num, rev));
//		int i;
//		String rev = "";
//		if(num<0) {
//			rev+="-";
//			num = Math.abs(num);
//		}
//		while(num!=0) {
//			i = (int) (num%10);
//			num/=10;
//			rev+=i;
//		}
//		long res = Long.parseLong(rev);
//		System.out.println(res);
	}
	
//	long reverse(long num, long rev) {
//		
//		
//		return rev;
//	}

}
