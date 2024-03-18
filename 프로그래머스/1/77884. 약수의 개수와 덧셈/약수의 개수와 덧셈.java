import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int left, int right) {
        int plus = IntStream.rangeClosed(left,right).filter(n-> per(n)%2==0).sum();
        int minus = IntStream.rangeClosed(left,right).filter(n-> per(n)%2==1).sum();
        return plus-minus;
    }
    public int per(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n % i ==0) cnt++;
        }
        return cnt;
    }
}