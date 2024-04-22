import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        List<String>li = new ArrayList<>();
        li.add(names[0]);
        for(int i=1;i<names.length;i++){
            if(i % 5 ==0 ) li.add(names[i]);
        }
        return li.stream().toArray(String[]::new);
    }
}