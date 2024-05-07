class Solution {
    public int solution(int a, int b) {
        String sA = String.valueOf(a);
        String sB = String.valueOf(b);
        
        
        return Math.max(Integer.parseInt(sA+sB),Integer.parseInt(sB+sA));
    }
}