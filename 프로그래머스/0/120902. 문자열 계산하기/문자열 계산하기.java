import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        answer = Arrays.stream(my_string.trim().replaceAll("[+] ","").replaceAll(" - "," -").split(" ")).mapToInt(Integer::parseInt).sum();
        
        return answer;
    }
}