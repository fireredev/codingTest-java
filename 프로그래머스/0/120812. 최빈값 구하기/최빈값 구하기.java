class Solution {
    public int solution(int[] array) {
        int answer = 0;
        if(array.length == 1)return array[0];
        int cnt=0;
        for(int i=0;i<array.length;i++){
            int icnt=0;
            for(int j=0;j<i;j++){
                if(array[i]==array[j]){
                    icnt++;
                    
                    if(cnt<icnt) {
                        cnt = icnt;
                        answer= array[i];
                    }else if(cnt==icnt) answer= -1;
                }
            }
        }
        if(cnt ==0) return -1;
        
        
        return answer;
    }
}