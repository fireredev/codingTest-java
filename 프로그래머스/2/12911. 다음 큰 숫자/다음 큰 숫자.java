class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int nCnt = Integer.bitCount(n);
        int taget = n+1;
        while(nCnt != Integer.bitCount(taget)){
            taget++;
        }
        
        
        return taget;
    }
}