class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1;i<=number;i++){
            answer+=fe(i,limit,power);
        }
        return answer;
    }
    private int fe(int i,int limit,int power){
        int cnt = 0;
        for(int k=1; k*k<=i;k++){
            if (k*k==i) cnt++;
            else if(i%k==0) cnt+=2;
        }
        if(cnt>limit) return power;
        else return cnt;
    }
}