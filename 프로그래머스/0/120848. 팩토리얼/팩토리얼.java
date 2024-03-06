class Solution {
    public int solution(int n) {
        int answer = 1;
        int i = 1;
        while(true){
            answer *= i++;
            if(answer>n)  break;
        }
        return i-2;
    }
}