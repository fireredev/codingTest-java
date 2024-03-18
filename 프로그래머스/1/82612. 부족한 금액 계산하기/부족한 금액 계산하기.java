import java.util.stream.*;
import java.lang.*;
class Solution {
    public long solution(int price, int money, int count) {
        long pee = IntStream.rangeClosed(1,count).mapToLong(v -> price * v).sum();
        long answer = money-pee;      
        if(answer<0) return Math.abs(answer);
        else return 0;
    }
}