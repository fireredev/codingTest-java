import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0;i<babbling.length;i++){
            babbling[i]= babbling[i].replace("aya"," ")
                       .replace("ye"," ")
                    .replace("woo"," ")
                .replace("ma"," ");
        }
        
        
        for(int i=0;i<babbling.length;i++){
            babbling[i].trim();
            if(babbling[i].isBlank()) answer++;
        }
        System.out.println(Arrays.toString(babbling));
        return answer;
    }
}