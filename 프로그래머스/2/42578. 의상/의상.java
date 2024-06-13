import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> type = new HashMap<>();
        for(String [] cloth : clothes){
            if(type.containsKey(cloth[1])){
                type.put(cloth[1],type.get(cloth[1])+1);
            }else{
                type.put(cloth[1],1);
            }
        }
        for(String key : type.keySet()){
            answer *= type.get(key)+1;
        }
        return answer-1;
    }
}