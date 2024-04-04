import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<i;j++){
                s.add(numbers[i]+numbers[j]);
            }
        }
        
        
        return s.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}