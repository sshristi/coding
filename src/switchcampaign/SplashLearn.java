package switchcampaign;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class SplashLearn {

	public static int solution(int[] A, int[] B, int N) {
		int M = A.length;
        int roads[] = new int[N+1];
        for(int i=0;i<M;i++){
            roads[A[i]] ++;
            roads[B[i]] ++;
            System.out.println(roads[A[i]] +":"+roads[B[i]]);
        }
        int max = Integer.MIN_VALUE;
        int node=0;
		for(int i:roads) {
			if(roads[i]>max) {
				max = roads[i];
				node = i;
			}
		}
		System.out.println(node);
		max = Integer.MIN_VALUE;
		
		for(int i=0;i<M;i++){
			System.out.println(max);
			if(A[i] == node) {
				max = Math.max(max,roads[node]+roads[B[i]]-1);
				System.out.println("max =" +max +"-"+roads[node]+":"+roads[B[i]]);
			}else if(B[i] == node){
				max = Math.max(max,roads[node]+roads[A[i]]-1);
				System.out.println("max =" +max +"-"+roads[node]+":"+roads[A[i]]);
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		
		int []A = {1,2,4,5};
		int []B = {2,3,5,6};
		int n = 6;
		
		System.out.println(solution(A,B,n));
	}
}
