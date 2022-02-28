package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map.Entry;


import leetcode.Test.Debit;

public class MyGraph {
	class Node{
		int value;
		int weight;
		int edges;
		Node(int value){
			this.value = value;
			this.edges=1;
		}
	}
	
	static Map<Integer, List<Node>> graph = new HashMap<>();
	public MyGraph(int N){
		for(int i=1;i<=N;i++) {
			graph.put(i,new LinkedList<>());
		}
	}
	
	public static void main(String[] args) {
		int[] A = {2, 2, 1, 2};
		int[] B = {1, 3, 4, 4};
		MyGraph g = new MyGraph(5);
		g.solution(5,A , B);

	}
	public int solution(int N, int[] A, int[] B) {
		for(int i=0;i<=A.length;i++) {
			if(graph.containsKey(A[i]))
				graph.get(A[i]).add(new Node(B[i]));
		}
		return -1;
    }
}
