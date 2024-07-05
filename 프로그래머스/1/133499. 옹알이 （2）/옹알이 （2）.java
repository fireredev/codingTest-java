class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String [] arr = {"aya","ye","woo","ma"};
        for(String s:babbling){
            for(String a:arr){
                if(s.contains(a)&&!s.contains(a.repeat(2))) {
                    s=s.replaceAll(a," ");
                }
            }
            if(s.isBlank()) answer++;
        }
        return answer;
    }
}