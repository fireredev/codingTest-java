import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        List<Character> li = Arrays.stream(spell)
            .map(s -> s.charAt(0)).collect(Collectors.toList());
        System.out.println(li);
        for(String str : dic) {
            if(str.length() == spell.length){
                Set<Character> spellSet = str.chars().mapToObj(d -> (char) d)
                                    .collect(Collectors.toSet());
            if (spellSet.containsAll(li)) return 1;    
            } 
        }
        return 2;
    }
}