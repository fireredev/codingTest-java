import java.util.*;
import java.util.stream.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = IntStream.range(0, strArr.length)
        .mapToObj(i -> i % 2 == 1 ? strArr[i].toUpperCase() : strArr[i].toLowerCase())
        .toArray(String[]::new);
        return answer;
    }
}