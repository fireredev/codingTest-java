import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        List <Integer> li = Arrays.stream(num_list).boxed().
                            collect(Collectors.toList());
        
        if(li.get((li.size())-1) > li.get((li.size())-2)) {
            li.add(li.get(li.size()-1)-li.get(li.size()-2));
        }else{
            li.add(2 * li.get((li.size()-1)));
        }
        
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}