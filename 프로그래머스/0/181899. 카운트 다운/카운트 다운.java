import java.util.stream.*;
import java.util.*;
class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = IntStream.rangeClosed(end_num,start).toArray();
        
        for(int i = 0; i < answer.length / 2; i++) {
            int temp = answer[i];
            answer[i] = answer[answer.length - i - 1];
            answer[answer.length - i - 1] = temp;
        }
        return answer;
    }
}