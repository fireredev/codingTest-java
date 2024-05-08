import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String [] answer = myString.split("x");
        Arrays.sort(answer);
        List<String>li = new ArrayList<>();
        for(String s: answer){
            if(!s.isBlank()){
                li.add(s);
            }
        }
        return li.stream().toArray(String[]::new);
    }
}