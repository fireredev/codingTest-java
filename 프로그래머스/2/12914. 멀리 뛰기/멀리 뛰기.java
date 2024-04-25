class Solution {
    // 메모이제이션을 위한 배열 선언
    private long[] memo;

    public long solution(int n) {
        // 메모이제이션 배열 초기화
        memo = new long[n + 1];
        
        // 재귀 함수를 호출하여 결과를 반환
        return fi(n);
    }

    private long fi(int n){
        // 기저 사례 처리
        if(n == 0) return 1;
        if(n == 1) return 1;
        
        // 이미 계산된 값이 있다면 그 값을 반환
        if(memo[n] != 0) return memo[n];
        
        // 현재 n에 대한 값을 계산하고 저장한 뒤 반환
        memo[n] = (fi(n - 1) + fi(n - 2)) % 1234567;
        
        return memo[n];
      
            
        
    }
}
