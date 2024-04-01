import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String [] arr = s.split(" ",-1);
        
        for(int i=0;i<arr.length;i++){
          String result="";
            for(int j=0;j<arr[i].length();j++){
             char c = arr[i].charAt(j);
            if(Character.isUpperCase(c)){
                c = (char)((c - 'A' + n) % 26 + 'A');
            }else if(Character.isLowerCase(c)){
                c = (char)((c - 'a' + n) % 26 + 'a');
            }
            
                result += c;
          }
            arr[i] = result;
        }
        System.out.println(Arrays.toString(arr));
        return answer= String.join(" ",arr);
    }
}