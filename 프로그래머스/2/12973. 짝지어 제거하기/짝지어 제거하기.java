import java.util.*;
class Solution
{
    public int solution(String s)
    {   
        ArrayDeque<Character> aq = new ArrayDeque<>(); 
        for(int i=0;i<s.length();i++){
            if(!aq.isEmpty() && aq.peek()==s.charAt(i)){
                aq.pop();
            }else{
                aq.push(s.charAt(i));
            }
        }
        
        return aq.isEmpty() ? 1 : 0;
    }
}