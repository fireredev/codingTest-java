class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] arr =s.split(" ");
        for(int i =0;i<arr.length;i++){
            try{answer += Integer.parseInt(arr[i]);}
            catch(NumberFormatException e){
                answer -= Integer.parseInt(arr[i-1]);
            }
                
        }
        return answer;
    }
}