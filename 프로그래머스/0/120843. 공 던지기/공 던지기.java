import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] numbers, int k) {
        int p = (2*k)-1;
        if(p % numbers.length == 0) {
            return numbers.length;
        }else{
            return p % numbers.length;   
        }
    }
}