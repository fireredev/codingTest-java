class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        char [] arr = s.toCharArray();
        int cnt = 0;
        
        for(char c : arr){
            cnt += c == '(' ? 1:-1;
            if(cnt < 0 ) return false;
        }
    
        return cnt == 0;
    }
}