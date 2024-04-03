import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        List<int[]>li = new ArrayList<>();
        int sum = brown+yellow;
        for(int i=3;i<=sum;i++){
            if(sum % i ==0 && i>= sum / i && sum / i >= 3) 
                li.add(new int[]{i,sum / i}); 
        }
        for(int i=0;i<li.size();i++){
            if((li.get(i)[0] - 2) * (li.get(i)[1] - 2) == yellow) return li.get(i);
        }
        return answer;
    }
}