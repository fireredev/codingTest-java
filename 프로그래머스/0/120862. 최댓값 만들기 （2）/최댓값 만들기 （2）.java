import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int [] arr = Arrays.stream(numbers).sorted().toArray();
        if(arr[0]*arr[1] > arr [numbers.length-1]* arr [numbers.length-2] ){
            return arr[0]*arr[1];
        }
        return arr[numbers.length-1]*arr[numbers.length-2];
    }
}