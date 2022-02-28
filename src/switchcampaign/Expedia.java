package switchcampaign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Expedia {

	public static void main(String[] args) {
		
//		System.out.println(minNum(650, List.of(82,112,134,178,206,229,238,	278,293,335)));
//		System.out.println(minNum(2, List.of(1,2,3)));
//		System.out.println(minNum(5, List.of(1,2,3,4,5)));
		System.out.println(printDivisors(1048576,12));

	}
	public static int minNum(int threshold, List<Integer> points) {
		
		int min = points.get(0),max1 = min, max2 = min, t1 = max1-min, t2 = max2-min;
		int count=1;
		if(t1 >= threshold)
			return count;
		for(int i=1;i<points.size();i++) {
			max1 = points.get(i);
			t1 = max1-min;
			if(t1 >=threshold) {
				count++;
				break;
			}else if(i+1<points.size()){
				max2 = points.get(i+1);
				t2 = max2-min;
			
				if(t2 >=threshold) {
					count++;
					break;
				}
			}else {
				i++;
				count++;
			}
				
		}
		return count;
	}
	static long printDivisors(long n, long p)
    {
		List<Long> divisors = new ArrayList<>();
		for (long i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                if (n/i == i)
                	divisors.add(i);  
                else {
                	divisors.add(i);
                	divisors.add(n/i);
                }
            }
            
        }  
		Collections.sort(divisors);
		System.out.println(divisors);

		if(p<=divisors.size())
            return divisors.get((int) (p-1));
        return 0;
    }

	public static List<Integer> scatterPalindrome(List<String> strToEvaluate) {
	    
			int ans = 0;
			int n = s.length();

			for(int i=0;i<n;i++) {
			    A[i]=A[i-1]^(1<<(s[i-1]-97))

			for i=1:n
			    for j=i;n
			        x=A[j]^A[i-1]
			        if (x&(x-1)) == 0    //if x is a power of 2 or not 
			            ans++;
			        endif
			    endfor
			endfor
	    }
	}
}

















int palCount =0;// It keeps count of the palindrome
for(int i=0;i<str.size();i++){ //Outer loop that is the start point of the substring
unordered_map<char,int> myMap; // To keep count of the characters
int oddCountChar = 0; //Keep count of the characters which have the odd frequency
for(int j =i;j<str.size();j++){
if(j==i){ // Fo the initial substring i.e. when j==i no of characters with odd freq must be initialized to 1
myMap[str[j]] =1;
oddCountChar = 1;
} else {
myMap[str[j]]++;
if(myMap[str[j]]%2 == 0)// If the count of a character has become even that means it was odd before
oddCountChar--;
else
oddCountChar++; // If the count of a character has become odd that means it was even before
}
if((j-i+1)%2 == 0 && oddCountChar==0) //j-i+1 i.e. the length of the substring,if even then no charcaters should have odd frequency
palCount++;
else if((j-i+1)%2 != 0 && oddCountChar==1) //j-i+1 i.e. the length of the substring,if odd then no charcaters should have even frequency
palCount++;
}
myMap.clear();
}
cout<<palCount<<endl;
return 0;
}
