import java.lang.*;
import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.toLowerCase().split(" ", -1);
        
        for (int i = 0; i < arr.length; i++) {
            String w = arr[i];
            if (!w.isEmpty()) {
                String str = w.substring(0, 1).toUpperCase() + w.substring(1);
                answer.append(str);
            }
            if (i < arr.length - 1) {
                answer.append(" "); 
            }
        }

        return answer.toString();
    }
}
