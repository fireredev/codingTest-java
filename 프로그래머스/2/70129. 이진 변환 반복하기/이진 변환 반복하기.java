class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        int length =0;
        int cnt = 0;
        int lencnt = 0;
        while(!s.equals("1")){
            for(char c : s.toCharArray()){
                if(c == '0') {
                    length++;
                }
            }
            s=String.valueOf(Integer.toBinaryString(s.length()-length));
            lencnt +=length;
            length=0;
            cnt++;
            
        }
            answer[0]=cnt;
            answer[1]=lencnt;
        return answer;
    }
}