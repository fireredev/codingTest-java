class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        //a는 갖다줘야하는 빈병의갯수 b는 콜라반환값 n는 초기값
        while(n>=a){
           answer += b *( n / a );
           n = n - (a * ( n / a ) ) + ( b * (n / a) );    
        }
        return answer;
    }
}