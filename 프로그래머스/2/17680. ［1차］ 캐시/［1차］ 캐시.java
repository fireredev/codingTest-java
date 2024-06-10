import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize==0) return cities.length * 5;
        List<String>li = new LinkedList<>();
        for(int i =0;i<cities.length;i++){
            String city = cities[i].toUpperCase();
            if(cacheSize>li.size()){
                if(li.contains(city)){
                    li.remove(city);
                    li.add(city);
                    answer++;
                }else{
                    li.add(city);
                    answer+=5;
                }
            }else{
                if(li.contains(city)){
                    li.remove(city);
                    li.add(city);
                    answer++;
                }else{
                    li.remove(0);
                    li.add(city);
                    answer+=5;
                }
            }
        }
        
        
        
        return answer;
    }
}