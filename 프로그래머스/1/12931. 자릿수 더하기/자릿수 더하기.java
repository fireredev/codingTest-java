import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        answer = str.chars().map(c -> c -'0').sum();

        return answer;
    }
}