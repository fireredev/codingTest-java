class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length();
        if(n % 2==1){
            return s.charAt(n/2)+"";
        }else{
                        
            return s.charAt(n/2-1)+""+s.charAt(n/2);   
        }
        
    }
}