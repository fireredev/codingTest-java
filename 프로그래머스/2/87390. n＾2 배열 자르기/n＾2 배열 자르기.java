class Solution {
    public int[] solution(int n, long left, long right) {
        int[] result = new int[(int)(right - left + 1)];
        
        for (long i = left; i <= right; i++) {
            int row = (int)(i / n); // 현재 요소의 행
            int col = (int)(i % n); // 현재 요소의 열
            result[(int)(i - left)] = Math.max(row, col) + 1;
        }
        
        return result;
    }
}
