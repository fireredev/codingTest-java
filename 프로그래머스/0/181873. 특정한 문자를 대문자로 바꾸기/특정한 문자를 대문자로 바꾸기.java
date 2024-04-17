class Solution {
    public String solution(String my_string, String alp) {
        String [] str = my_string.split("");
        String s = "";
        for(int i=0;i<str.length ;i++){
            
            if(str[i].equals(alp)){
                s  += str[i].toUpperCase();
                continue;
            }
            s += str[i];
        }
        return s;
    }
}