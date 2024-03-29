import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        return Arrays.stream(numbers).map(val -> 2*val).toArray();
    }
}