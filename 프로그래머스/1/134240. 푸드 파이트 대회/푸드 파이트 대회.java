class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1;i<food.length;i++){
            int t =  food[i] / 2 ;
            answer += String.valueOf(i).repeat(t);
        }
        StringBuffer sb = new StringBuffer(answer);
        sb.reverse();
        answer += "0";
        
        return answer.concat(sb.toString());
    }
}