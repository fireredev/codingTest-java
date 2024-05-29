import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        List<Integer>li = new ArrayList<>();
        for(int i =intervals[0][0];i<=intervals[0][1];i++){
            li.add(arr[i]);
        }
        for(int i =intervals[1][0];i<=intervals[1][1];i++){
            li.add(arr[i]);
        }
        return li.stream().mapToInt(i->i).toArray();
    }
}