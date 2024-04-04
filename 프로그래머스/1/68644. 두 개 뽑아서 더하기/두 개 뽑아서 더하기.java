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
        List<Integer> li = new ArrayList<>(s);
        Collections.sort(li);
        
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}