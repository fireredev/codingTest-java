import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        List<Integer>li=new ArrayList<>();
        
        while(true){
            for(int i=0;i<citations.length;i++){
               if(citations[i]>=answer){
                    li.add(citations[i]);
               }
            }
            if(li.size()>=answer){
                li.clear();
            }else{
                break;
            }
            answer++;
            
        }
        return answer-1;
    }
}