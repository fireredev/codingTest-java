class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            int p=0;
            for(int j=i;j<=n;j++){
                p+=j;
                if(p==n){
                    answer++;
                    break;
                }else if(p>n){
                    break;
                }
            }
        }
        return answer;
    }
}