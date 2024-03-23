import java.util.*;
import java.util.stream.*;
public class Solution {
    public int[] solution(int []arr) {
        List<Integer>li = new ArrayList<>();
        li.add(arr[0]);
        for(int i=0;i<arr.length;i++){
            if(li.get(li.size()-1) != arr[i]) li.add(arr[i]);  
        }
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}