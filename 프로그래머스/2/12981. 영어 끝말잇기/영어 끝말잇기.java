import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        int[] answer = {0, 0}; 
        Set<String> usedWords = new HashSet<>(); 

        usedWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            
            String currentWord = words[i];
            String previousWord = words[i - 1];
            
            if (usedWords.contains(currentWord) || previousWord.charAt(previousWord.length() - 1) != 
                                                                                    currentWord.charAt(0)) {
                answer[0] = (i % n) + 1; 
                answer[1] = (i / n) + 1; 
                return answer;
            }
            usedWords.add(currentWord);
        }
        return answer;
    }
}
