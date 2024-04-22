import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer>li=new ArrayList<>();
        li.add(num_list[0]);
        for(int i=1;i<num_list.length;i++){
            if(i%n==0) li.add(num_list[i]);
        }
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}