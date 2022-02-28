package leetcode;

//public class VirusTransmission {
	
//}
import java.util.*;
class VirusTransmission{
	
    private static class State{
        int  time;
        int x;
        int y;
        State(int x,int y,int time){
            this.x = x;
            this.y = y;
            this.time = time;
        }
        public String toString(){
            return String.format("{x:%d y:%d time:%d }",x,y,time);
        }
    }
    
    public static void main(String[] args){
//    	Scanner sc = new Scanner(System.in);
//    	int t = sc.nextInt();
//    	int m,n;
//    	String[] cells; 
//    	while(t-->0) {
//    		n = sc.nextInt();
//    		m = sc.nextInt();
//    		cells = new String[n];
//    		for(int i = 0; i < n; i++){
//                cells[i] = sc.next();
//    		}
//    		System.out.println(minDayToInfect(n, m, cells));
	        System.out.println(minDayToInfect(4,5,new String[]{"02_20","21212","_121_","__2__"}));
//	        System.out.println(minDayToInfect(3,3,new String[]{"_1_","101","_1_"}));
//	        System.out.println(minDayToInfect(2,3,new String[]{"1_2","_0_"}));
//	        System.out.println(minDayToInfect(1,2,new String[]{"0_"}));
//	        System.out.println(minDayToInfect(3,4,new String[]{"2220","2___","2222"}));
//    	}
    }
    
    private static int minDayToInfect(int N,int M,String[] ip){
        char[][] grid = new char[N][M];
        
        PriorityQueue<State> pq = new PriorityQueue<>((a,b)->a.time - b.time);
        for(int i = 0; i < N; i++){
            for(int j = 0;j < M ;j++){
                if(j >= ip[i].length()){
                    grid[i][j] = '_';
                }
                else{
                    grid[i][j] = ip[i].charAt(j);
                }
                
                if(grid[i][j] == '0'){
                    pq.add(new State(i,j,0));
                }
            }
        }
        
        int time  = 0;
        while(!pq.isEmpty()){
            State earliest = pq.poll();
             System.out.println(earliest);
            time = Math.max(time,earliest.time);
            List<List<Integer>> validNeighbors = getValidNeighbors(earliest.x,earliest.y,N,M,grid);
            System.out.println(validNeighbors);
            for(List<Integer> ne:validNeighbors){
                int xi = ne.get(0), yi=ne.get(1);
                pq.add(new State(xi,yi,earliest.time + ( grid[xi][yi] - '0')));
            }
            
            grid[earliest.x][earliest.y] = '0';
        }
        return checkNoInfection(grid) ? time : -1;
    }
    
    private static boolean checkNoInfection(char[][] grid){
        for(char[] row:grid){
            for(char each:row){
                if(each == '1'|| each == '2')
                    return false;
            }
        }
        return true;
    }
    
    private static List<List<Integer>> getValidNeighbors(int x,int y,int N,int M,char[][] grid){
        List<List<Integer>> validNeighbors = new ArrayList<>();
        int[][] moves = {{0,1},{0,-1},{1,0},{-1,0}};
        
        for(int[] move:moves){
            int xi = x + move[0];
            int yi = y + move[1];
            
            boolean xiValid = (0 <= xi) && (xi <= N-1);
            boolean yiValid = (0 <= yi) && (yi <= M-1);
            
            if(xiValid && yiValid && (grid[xi][yi]!='0') && (grid[xi][yi]!='_')){
                validNeighbors.add(Arrays.asList(xi,yi));
            }
            
        }
        return validNeighbors;
    }
    
    
}


//
//#include<iostream>
//#include<vector>
//#include<queue>
//using namespace std;
//
//class Node{
//public:
//		int x, y;
//};
//
//bool InRange(int a, int b, int c, int d){
//    if(a < 0 || b < 0 || a >= c || b >= d)
//        return false;
//    
//    return true;
//}
//
//int MinDaysToInfectAllCells(vector<vector<char>> &grid, int row, int col){
//	vector<vector<bool>> visited(row, vector<bool>(col, false));
//	queue<Node> bfsQueue;
//	int count = 0;
//	for(int i = 0; i < row; i++){
//		for(int j = 0; j < col; j++){
//			if(grid[i][j] == '0'){
//				bfsQueue.push({i, j});
//				visited[i][j] = true;
//			}
//			else if(grid[i][j] != '_'){
//			    count++;
//			}
//		}
//	}
//
//	int minDays = 0;
//	
//	while(count > 0){
//		int len = bfsQueue.size();
//		if(len == 0){
//		    return -1;
//		}
//		for(int i = 0; i < len; i++){
//			Node node = bfsQueue.front();
//			bfsQueue.pop();
//			int x = node.x,
//				y = node.y;
//				
//			if(grid[x][y] == '1'){
//				grid[x][y] = '0';
//				bfsQueue.push(node);
//				count--;
//			}
//			else{
//				for(int i : {-1, 0, 1}){
//					for(int j : {-1, 0, 1}){
//						if((abs(i) + abs(j) == 1) and InRange(x + i, y + j, row, col) and !visited[x + i][y + j] and grid[x + i][y + j] != '_'){
//							visited[x + i][y + j] = true;
//							if(grid[x + i][y + j] == '2')
//							    grid[x + i][y + j] = '1';
//							else if(grid[x + i][y + j] == '1'){
//							    grid[x + i][y + j] = '0';
//							    count--;
//							}
//							bfsQueue.push({x + i, y + j});
//						}
//					}
//				}
//			}
//			
//		}
//		minDays++;
//	}
//
//	return minDays;
//}
//
//signed main(){
//	int t;
//	cin >> t;
//	while(t--){
//		int row, col;
//		cin >> row >> col;
//
//		vector<vector<char>> grid(row, vector<char>(col));
//		for(int i = 0; i < row; i++){
//			for(int j = 0; j < col; j++){
//				cin >> grid[i][j];
//			}
//		}
//
//		cout << MinDaysToInfectAllCells(grid, row, col) << "\n";
//	}
//
//	return 0;
//}