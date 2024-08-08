class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        
        for(int i=0;i<targets.length;i++){
            int idx = 0;
            boolean word=true;
            for(int k=0;k<targets[i].length();k++){
                int cnt =101;
                for(int j=0;j<keymap.length;j++){
                    for(int m=0;m<keymap[j].length();m++){
                        if(targets[i].charAt(k)==keymap[j].charAt(m)){
                            cnt=Math.min(cnt,m+1);
                            break;
                        }
                    }
                }
                idx+=cnt;
                if(cnt==101) {
                    word=false; 
                    break;
                }
            }
            if(word){
                answer[i]=idx;    
            }else{
                answer[i]=-1;
            }
            
        }
        return answer;
    }
}