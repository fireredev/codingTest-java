class Solution {
    public int[] solution(int num, int total) {
        
        int [] answer = new int [num];
        int avg = (total / num);
        int h = num / 2;
        int d = avg - h;
        int c = d+1;
        System.out.print(h);
        if(num % 2 != 0){
            for(int i=0;i<num;i++){
                answer[i] = d++;
            }
            return answer;
        }else{
            for(int i=0;i<num;i++){
                answer[i] = c++;
            }
            return answer;
        }
        
        
        
    }
}