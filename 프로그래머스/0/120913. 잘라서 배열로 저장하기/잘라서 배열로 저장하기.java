import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String>li = new ArrayList<>();
         while(my_str.length()>=n){
             li.add(my_str.substring(0,n));
             my_str = my_str.substring(n);
         }
        if(!my_str.isEmpty())li.add(my_str);
        return li.stream().toArray(String[]::new);
    }
}