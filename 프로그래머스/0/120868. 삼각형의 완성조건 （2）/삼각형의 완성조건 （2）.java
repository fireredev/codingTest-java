import java.lang.*;
import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0],sides[1]);
        int min = Math.min(sides[0],sides[1]);
        
        //n이 가장 길때
        long i = IntStream.range(1,max + min).filter(n -> max + min > n  && max <= n).count();
        System.out.println(i);
        //max가 가장 길때
        long i2 = IntStream.range(1,max).filter(n -> n + min > max  && n < max).count();
        System.out.println(i2);
        
        answer = (int)(i+i2);
       
        return answer;
    }
}