import java.util.*;
import java.lang.*;
class Solution {
    public String solution(String s) {
        char [] arr= s.toCharArray();
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();
        sb.append(arr);
        sb.reverse();
        return sb.toString();
    }
}