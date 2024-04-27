import java.util.stream.*;
import java.util.*;
class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = IntStream.rangeClosed(-start,-end_num).map(i->-i).toArray();
        
       
        return answer;
    }
}