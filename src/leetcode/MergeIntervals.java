package leetcode;

import java.util.*;

//MEDIUM: https://leetcode.com/problems/merge-intervals/

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0])); //sort according to first index
        int t=0;
        List<int[]> result = new LinkedList<>();    //using array will fix the size & extra cells will give [0,0](will not be deleted)
        result.add(intervals[0]);                   //add 1st block to start comparing & updating from it.
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] - result.get(t)[1]<=0){
                if(intervals[i][1] - result.get(t)[1]>=0){  //[1,4],[2,3] => [1,4] (flush inner intervals)
                    result.get(t)[1] = intervals[i][1];
                }else{
                    continue;                               
                }    
            }else{
                result.add(new int[2]);                 //it is a list, have to create a new index
                t++;
                result.get(t)[0] = intervals[i][0];     //unmerged intervals will be added directly
                result.get(t)[1] = intervals[i][1];
            }
        }
        return result.toArray(new int[result.size()][]);      //convert to array of integers
    }
}