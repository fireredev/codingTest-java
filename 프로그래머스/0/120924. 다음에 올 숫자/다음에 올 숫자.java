class Solution {
    public int solution(int[] common) {
        if( common[0]+common[common.length-1] == common[1]+common[common.length-2]){
            return (common[1]-common[0])+common[common.length-1];
        }
        return (common[1] / common[0]) * common[common.length-1];
    }
}