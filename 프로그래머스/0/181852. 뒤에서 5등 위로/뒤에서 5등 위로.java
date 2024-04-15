import java.util.stream.*;
import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = IntStream.range(5,num_list.length).map(i -> num_list[i]).toArray();
        return answer;
    }
}