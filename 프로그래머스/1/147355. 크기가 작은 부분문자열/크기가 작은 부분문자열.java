class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = t.length()-p.length();

        for(int i=0;i<=size;i++){
            String str = t.substring(i,p.length()+i);
            if(Long.parseLong(str)<=Long.parseLong(p)) answer++;
        }
        return answer;
    }
}