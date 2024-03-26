import java.util.stream.*;
import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=0;i<n;i++){
            while(i % 3 ==0 || Integer.toString(i).contains("3")){
                i++;
                n++;    
            }
            answer= i;
        }
        return answer;
    }
}