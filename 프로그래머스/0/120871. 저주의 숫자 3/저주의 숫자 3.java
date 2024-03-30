import java.util.stream.*;
import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
               int[] answer1 = IntStream.iterate(0, i -> i + 1) 
                .filter(i -> i % 3 != 0 && !Integer.toString(i).contains("3")) 
                .limit(n) 
                .toArray();
        return answer1[answer1.length-1];
    }
}