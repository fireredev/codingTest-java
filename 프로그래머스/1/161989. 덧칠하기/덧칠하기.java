import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        int end = start+m-1;
        
        for(int i=1;i<section.length;i++){
            if(section[i]>end){
                start=section[i];
                end=start+m-1;
                answer++;
            }
        }
        
        return answer;
    }
}