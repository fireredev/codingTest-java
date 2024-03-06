import java.util.*;
class Solution {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[a-z]"," ")
                                .replaceAll("[A-Z]"," ").trim().replaceAll("\\s+",",");
        if(str.equals(""))return 0;
        System.out.println(str);
        
        return Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).sum();
    }
}