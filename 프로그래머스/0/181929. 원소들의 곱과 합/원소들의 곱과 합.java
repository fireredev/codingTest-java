import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        for(int i=0;i<num_list.length;i++){
            answer *= num_list[i];
        }
        System.out.println(answer);
        int d = Arrays.stream(num_list).sum();
        d = d*d;
        System.out.println(d);
        return answer < d ?1:0;
    }
}