import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char [] c = s.toCharArray();
        Arrays.sort(c);
        char [] c1 = c.clone();
        
        for(int i=0;i<c.length;i++){
            int count =0;
            for(int j=0;j<c.length;j++){
                if(c[i]==c1[j]) count++;
            }
            if(count==1) answer += String.valueOf(c[i]);
        }
        
        return answer; 
            
    }
}