class Solution {
    // 메모이제이션을 위한 배열 선언
    private long[] memo;

    public long solution(int n) {
        
        memo = new long[n + 1];
        
        
        return fi(n);
    }

    private long fi(int n){
       
        if(n == 0) return 1;
        if(n == 1) return 1;
        
        
        if(memo[n] != 0) return memo[n];
        
       
        memo[n] = (fi(n - 1) + fi(n - 2)) % 1234567;
        
        return memo[n];
      
            
        
    }
}
