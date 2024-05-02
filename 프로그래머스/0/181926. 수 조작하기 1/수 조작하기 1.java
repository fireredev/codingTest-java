class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char [] arr = control.toCharArray();
        for(char c: arr){
            if(c=='w') answer=answer+1;
            if(c=='s') answer=answer-1;
            if(c=='d') answer=answer+10;
            if(c=='a') answer=answer-10;
        }
        return answer;
    }
}