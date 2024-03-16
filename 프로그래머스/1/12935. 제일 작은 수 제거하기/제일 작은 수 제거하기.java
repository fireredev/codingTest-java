import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1) return new int [] {-1};
        
        int min = Arrays.stream(arr).min().orElse(0); 
        
        return Arrays.stream(arr).filter(v -> v !=min).toArray();
    }
}