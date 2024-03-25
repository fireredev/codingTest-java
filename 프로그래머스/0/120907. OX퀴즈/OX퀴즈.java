import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String [quiz.length];
        for(int i=0;i<quiz.length;i++){
            String [] c = quiz[i].split(" ");
            if(c[1].equals("+")) {
                if(Integer.parseInt(c[0]) + Integer.parseInt(c[2]) == Integer.parseInt(c[4])) {
                    answer[i] = "O";
                }else answer[i] = "X";
            }else {
                if(Integer.parseInt(c[0]) - Integer.parseInt(c[2]) == Integer.parseInt(c[4])) {
                    answer[i] = "O";
                }else answer[i] = "X";
            }
            
        }
        
        return answer;
    }
}