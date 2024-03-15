import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        
        int i = Arrays.stream(numbers).sum();
        
        return 45-i;
    }
}