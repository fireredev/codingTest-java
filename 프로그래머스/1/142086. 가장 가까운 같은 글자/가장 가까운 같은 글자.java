class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String str ="";
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            str+=c;
            if(str.lastIndexOf(c) != str.indexOf(c)){
                answer[i]=i-str.lastIndexOf(c,str.lastIndexOf(c)-1);
            }else{
                answer[i]=-1;
            }
        }
        
        return answer;
    }
}