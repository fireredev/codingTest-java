import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 1;
        
       
        List<Integer>li = getList(Arrays.stream(tangerine).
                            boxed().collect(Collectors.toList()));
        
        
        Collections.sort(li,Collections.reverseOrder());
        for(int i=0;i<li.size();i++){
            k=k-li.get(i);
            if(k<=0) return answer;
            answer++;
        }
  
        return k;
    }
    private List<Integer>getList(List<Integer>li){
         List<Integer> occurrenceList = li.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())) // 각 원소의 등장 횟수를 계산
                .values() // 등장 횟수 값들의 컬렉션
                .stream()
                .map(Long::intValue) // Long을 Integer로 변환
                .collect(Collectors.toList()); // 결과를 리스트로 수집

        return occurrenceList;
    }
}