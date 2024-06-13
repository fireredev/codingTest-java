import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer>answer=new ArrayList<>();
        List<Integer>li = new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            int Dday = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
            li.add(Dday);
        }
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for(int i=0;i<li.size();i++){
            if(ad.isEmpty()){
                ad.add(li.get(i));
                answer.add(1);
            }else if(ad.peek()<li.get(i)){
                ad.clear();
                ad.add(li.get(i));
                answer.add(1);
            }else{
                int size = answer.size()-1;
                answer.set(size,answer.get(size)+1);
            }
            
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}