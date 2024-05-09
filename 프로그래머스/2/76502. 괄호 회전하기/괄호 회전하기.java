import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(char c: s.toCharArray()){
            s =s.substring(1)+s.substring(0,1);    
            Stack<Character> t = new Stack<>();
            boolean checkPair=true;
            for(char ch : s.toCharArray()){
                if(ch == '('||ch == '['||ch == '{'){
                    t.push(ch);
                }else if(ch == ')'||ch == ']'||ch == '}'){
                    if(t.isEmpty()){
                        checkPair=false;
                        break;
                    }
                    if(pair(t.peek(),ch)){
                        t.pop();
                    }else{
                        checkPair=false;
                        break;
                    }
                }
            }
            if(t.isEmpty()&&checkPair) answer++;
        }
        return answer;
    }
    private boolean pair(char op , char cl){
        return (op=='(' && cl ==')'||op=='{' && cl =='}'||op=='[' && cl ==']');
    }
}