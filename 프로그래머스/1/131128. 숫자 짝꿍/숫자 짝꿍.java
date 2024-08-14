import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int cnt =0;
        HashMap<Character,Integer> xMap = createMap(X);
        HashMap<Character,Integer> yMap = createMap(Y);
        StringBuilder sb = new StringBuilder();
        for(char c: xMap.keySet()){
            if(yMap.containsKey(c)){
                cnt= Math.min(xMap.get(c),yMap.get(c));
                for (int i = 0; i < cnt; i++) {
                    sb.append(c);
                }
            }
        }
        sb = sb.reverse();
        if(sb.length()==0) {
            return "-1";
        }else if(sb.toString().startsWith("0")){
            return "0";
        }else{
            return sb.toString();
        }
        
        
    }
    private HashMap<Character,Integer> createMap (String str){
        HashMap<Character,Integer> m = new HashMap<>();
        for(char c : str.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        return m;
    }
}