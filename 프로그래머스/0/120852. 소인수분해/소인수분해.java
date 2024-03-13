import java.util.*;

class Solution {
    public int[] solution(int n) {  
        List<Integer> li = new ArrayList<Integer>();
        int i = 2;
        while(n>1){
           while(n % i == 0){
               li.add(i);
               n /= i;
           }
            i++;
        }
        return li.stream().mapToInt(Integer::intValue).distinct().toArray();
    }
}