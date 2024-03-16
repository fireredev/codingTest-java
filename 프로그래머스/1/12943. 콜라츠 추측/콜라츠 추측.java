class Solution {
    public int solution(int num) {
        int cnt =0;
        while(cnt<=500){
            if(num == 1 )break;
            
            if(num%2==0){
                num /= 2;
            }else if(num%2==1){
                num= (3*num) +1;
            }
            cnt++;
        }
        if(cnt==501) cnt=-1;
        return cnt;
    }
}