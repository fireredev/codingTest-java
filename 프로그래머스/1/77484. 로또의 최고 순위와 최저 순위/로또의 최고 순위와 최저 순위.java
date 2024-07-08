class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int cnt =0;
        int zcnt=0;
        for(int n : lottos){
            for(int k : win_nums){
                if(n ==k) cnt++;
            }
            if(n==0) zcnt++;
        }
        answer[0]=(7-(cnt+zcnt));
        answer[1]=(7-(cnt));
        if(answer[1]>=7) answer[1]=6;
        if(answer[0]>=7) answer[0]=6;
        return answer;
    }
}