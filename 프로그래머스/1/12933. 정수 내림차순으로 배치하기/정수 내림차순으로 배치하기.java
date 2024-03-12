import java.util.*;
import java.lang.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        String str = String.valueOf(n);
        String [] arr = str.split("");
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();
        for(String s : arr){
            sb.append(s);
        }
        sb.reverse();
        answer = sb.toString();
        return Long.parseLong(answer);
    }
}