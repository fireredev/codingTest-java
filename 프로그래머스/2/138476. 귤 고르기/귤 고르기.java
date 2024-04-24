import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
class Solution {
    public int solution(int k, int[] tangerine) {
        List<Integer> li = Arrays.stream(tangerine)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                                               Collectors.counting()))
                .values()
                .stream()
                .sorted(Comparator.reverseOrder())
                .map(Long::intValue)
                .collect(Collectors.toList());
        
        int answer = 1;
        
        for(int i=0;i<li.size();i++){
            k=k-li.get(i);
            if(k<=0) return answer;
            answer++;
        }
        
  
        return k;
    }
   
}