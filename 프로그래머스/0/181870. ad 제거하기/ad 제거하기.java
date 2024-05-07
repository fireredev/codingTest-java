import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> li = new ArrayList<>();
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")) li.add(strArr[i]);
        }
        return li.stream().toArray(String[]::new);
    }
}