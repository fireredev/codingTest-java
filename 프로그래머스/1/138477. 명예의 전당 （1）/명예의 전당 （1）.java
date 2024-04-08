import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        List <Integer>li = new ArrayList<>();
        if(k >= score.length){
            answer[0]=score[0];
            for(int i=1;i<score.length;i++){
                if(score[i]>answer[i-1]){
                    answer[i]=answer[i-1];
                }else {
                    answer[i]=score[i];
                }
            }
            return answer;
        }
        for(int i =0;i<score.length;i++){
            while(i<k){
                li.add(score[i]);
                Collections.sort(li);
                answer[i] = li.get(0);
                ++i;
            }
            if(score[i]>li.get(0)) {
                li.set(0,score[i]);
                Collections.sort(li);
            }
            answer[i] = li.get(0);
        }
        return answer;
    }
}