import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        List<Character> li = new ArrayList<>();
        HashSet<Character> skipSet = new HashSet<>();
        char [] chaArr = s.toCharArray();
        
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!skipSet.contains(ch)) {
                li.add(ch);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int k = 0; k < li.size(); k++) {
                if (chaArr[i] == li.get(k)) {
                    int num = k + index;
                    if (num >= li.size()) num = num % li.size(); 
                    chaArr[i] = li.get(num);
                    break; 
                }
            }
        }
        String answer = new String(chaArr);
        return answer;
    }
}