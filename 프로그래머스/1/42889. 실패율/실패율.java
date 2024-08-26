import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer,Double>m=new HashMap<>();
        int cnt=1;
        int fal=0;
        int trynum=stages.length;
        while(cnt!=N+1){
            for(int i =0;i<stages.length;i++){
                if(cnt==stages[i]){   
                    fal++;
                }    
            }
            if(fal!=0){
                m.put(cnt,(double)fal / trynum);    
            }else{
                m.put(cnt,0.0);
            }
            trynum-=fal;
            cnt++;
            fal=0;
        }
        List<Map.Entry<Integer, Double>> sortedList = new ArrayList<>(m.entrySet());
        sortedList.sort((entry1, entry2) -> {
            int valueComparison = entry2.getValue().compareTo(entry1.getValue()); 
            if (valueComparison == 0) {
                return entry1.getKey().compareTo(entry2.getKey()); 
            }
            return valueComparison;
        });
        
        return sortedList.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}