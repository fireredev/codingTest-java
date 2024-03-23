import java.lang.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuffer sb = new StringBuffer(Integer.toString(n,3));
        sb.reverse();
        String str = sb.toString();
        int three = Integer.parseInt(str,3);
        String ten = Integer.toString(three,10);
        return Integer.parseInt(ten);
    }
}