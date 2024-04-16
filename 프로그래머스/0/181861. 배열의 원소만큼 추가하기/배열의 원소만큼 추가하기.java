import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List <Integer> li = new ArrayList<>();
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            idx=0;
            while(idx !=arr[i]){
                li.add(arr[i]);
                idx++;
            }
        }
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}