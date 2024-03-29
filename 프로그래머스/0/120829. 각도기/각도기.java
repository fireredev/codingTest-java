class Solution {
    public int solution(int angle) {
        double dAngle = angle;
        double answer = 0;
        answer = (dAngle/90);
        
        if(0 <=answer  && answer <=1){
             return (int)answer+1;
        }else{
             return (int)answer+2;    
        }
            
            
    }
}