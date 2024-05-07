import java.util.*;
class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        Long l = Arrays.stream(num_list).filter(i-> i ==n).count();
        
        return l.intValue() >0? 1: 0;
    }
}