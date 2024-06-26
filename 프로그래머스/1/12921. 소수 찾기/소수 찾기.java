class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=2;i<=n;i++){
            for(int k=2;k*k<=i;k++){
                if(i%k==0){
                    answer++;
                    break;
                }
            }
        }
        return n-answer;
    }
}