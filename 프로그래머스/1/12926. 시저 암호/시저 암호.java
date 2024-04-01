import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String [] arr = s.split(" ",-1);
        
        for(int i=0;i<arr.length;i++){
          String result="";
            for(int j=0;j<arr[i].length();j++){
             char c = (char)(arr[i].charAt(j) + n );
            if(Character.isLowerCase(arr[i].charAt(j))){
                if(c > 'z') {
                 c = (char)(c - 26);
                } 
             }else{
                if(c > 'Z'){
                 c = (char)(c - 26);
                }    
             }
                result += c;
          }
            arr[i] = result;
        }
        
        return answer= String.join(" ",arr);
    }
}