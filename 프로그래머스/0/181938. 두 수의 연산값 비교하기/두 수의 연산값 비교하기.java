class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String x = Integer.toString(a)+Integer.toString(b);
        int y = 2 * a * b;
       
        return  Integer.parseInt(x)<y ? y:Integer.parseInt(x);
    }
}