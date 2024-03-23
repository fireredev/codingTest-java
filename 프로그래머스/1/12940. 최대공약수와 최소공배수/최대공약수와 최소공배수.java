import java.lang.*;
import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int s=Math.min(n,m);
        int r=Math.max(n,m);
        
        answer [0] = sol(s,r);
        answer [1] = n * m / answer[0];
        return answer;
    }
    public int sol(int n,int m){
        int answer =0;
        int [] arrN = IntStream.rangeClosed(1,n).filter(f -> n % f == 0).toArray();
        int [] arrM = IntStream.rangeClosed(1,m).filter(f -> m % f == 0).toArray();
        
        for(int i=0;i<arrN.length;i++){
            for(int j=0;j<arrM.length;j++){
                if(arrN[i]==arrM[j] && arrN[i] > answer){
                    answer = arrN[i];
                }
            }
        }
        return answer;
    }
    
}