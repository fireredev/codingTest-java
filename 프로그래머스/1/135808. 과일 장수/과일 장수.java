import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> aps=new ArrayList<>();
        Arrays.sort(score);
        
        for(int i=score.length-1;i>=0;i--){
            if(score[i]<=k) aps.add(score[i]);
            else aps.add(k);
        }
        
        for(int i=0;i<aps.size();i++){
            if(i % m == m-1){
                answer+=aps.get(i);
            }
        }
        return answer*m;
    }
}