import java.util.stream.*;
import java.lang.Math;
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int min =Math.min(a,b);
        int max =Math.max(a,b);
        
        answer = LongStream.rangeClosed(min,max).sum();
        return answer;
    }
}