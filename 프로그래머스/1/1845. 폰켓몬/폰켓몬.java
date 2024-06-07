import java.util.stream.*;
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> s = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return Math.min(nums.length/2,s.size());
    }
}