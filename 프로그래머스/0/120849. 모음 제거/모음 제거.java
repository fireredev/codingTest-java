import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        return my_string.chars()
                .filter(c -> !vowels.contains((char) c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}