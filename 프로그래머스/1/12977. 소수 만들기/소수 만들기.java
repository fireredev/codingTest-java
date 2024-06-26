class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0;i<nums.length;i++){
            for(int k=0;k<i;k++){
                for(int j=0;j<k;j++){
                    int num = nums[i]+nums[k]+nums[j];
                    if(fN(num)){
                        answer++;
                    }
                }
            }
            
        }
        return answer;
    }
    private boolean fN(int i){
        for(int k=2;k<i;k++){
            if(i%k==0){
               return false; 
            }
        }
        return true;
    }
}