import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> li = new ArrayList<>();
        for(int i=0;i<todo_list.length;i++){
            if(!finished[i]) li.add(todo_list[i]);
        }
        return li.stream().toArray(String[]::new);
    }
}