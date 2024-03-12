import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str ="";
        for(int i=0;i<array.length;i++){
            str +=String.valueOf(array[i]);
        }
        String [] arr = str.split("");
        Arrays.stream(arr).filter(v -> v.equals("7")).count();
        return (int)Arrays.stream(arr).filter(v -> v.equals("7")).count();
    }
}