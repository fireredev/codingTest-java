import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int [] one= {1,2,3,4,5};
        int [] two= {2,1,2,3,2,4,2,5};
        int [] three ={3,3,1,1,2,2,4,4,5,5};
        int ocnt=0;
        int twcnt=0;
        int thcnt=0;
        
        for(int i=0;i<answers.length;i++){
            if(answers[i]==one[i%5]) ocnt++;
            if(answers[i]==two[i%8]) twcnt++;
            if(answers[i]==three[i%10]) thcnt++;
        }
        List<Integer>li=new ArrayList<>();
        int score = Math.max(ocnt,Math.max(twcnt,thcnt));
        if(score == ocnt) li.add(1);
        if(score == twcnt) li.add(2);
        if(score == thcnt) li.add(3);
        
        return li.stream().mapToInt(i->i).toArray();
    }
}