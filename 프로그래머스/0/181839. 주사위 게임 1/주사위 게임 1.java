class Solution {
    public int solution(int a, int b) {
        int answer = Math.abs(a-b);
        if((a+b) % 2 == 1) return 2 * (a+b);
        else if(a%2==1 || b%2==1) return a *a + b*b;
        return answer;
    }
}