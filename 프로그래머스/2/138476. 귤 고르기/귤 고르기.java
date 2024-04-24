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
        
        for(int i:li){
            k-=i;
            if(k<=0) break;
            answer++;
        }
  
        return answer;
    }
   
}