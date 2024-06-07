import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String,Integer>basket = new HashMap<>();
        for(int i=0;i<want.length;i++){
            basket.put(want[i],number[i]);
        }
        
        for(int i = 0; i <= discount.length - 10; i++){
            Map<String,Integer>cb = new HashMap<>(basket);
            for(int j = i; j < i + 10; j++){
                if(cb.containsKey(discount[j])){
                    cb.put(discount[j],cb.get(discount[j])-1);
                }
            }
            boolean empty=true;
            for(int count:cb.values()){
                if(count>0){
                    empty=false;
                    break;
                }
            }
            if(empty) answer++;
        }
        return answer;
    }
}