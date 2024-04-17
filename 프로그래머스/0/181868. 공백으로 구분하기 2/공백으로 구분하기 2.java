import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split(" ",-1);
        
        return Arrays.stream(answer).filter(i -> !i.isEmpty()).toArray(String[]::new);
    }
}