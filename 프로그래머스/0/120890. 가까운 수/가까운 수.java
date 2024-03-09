import java.util.*;
import java.math.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int [] clsArr = array.clone();
        for(int i=0;i<array.length;i++){
            clsArr[i]=array[i]-n;
            clsArr[i]=Math.abs(clsArr[i]);
        }
        
        Arrays.sort(clsArr);
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++){
            if(Math.abs(array[i]-n)==clsArr[0]) {
                answer = array[i];
                break;
            }
        }
        System.out.println(Arrays.toString(clsArr));
        return answer;
    }
}