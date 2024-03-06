import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                        ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                        ".--","-..-","-.--","--.."};
        String str ="";
        String [] arr = letter.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<morse.length;j++){
                if(arr[i].equals(morse[j])){
                     char cr = (char)(j + 'a');
                    answer += cr;
                }
            }
        }
        
        return answer;
    }
}