import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        
        int [] bArr= IntStream.rangeClosed(1,b).filter(v-> b % v == 0).toArray();
       
        Set <Integer> aSet= IntStream.rangeClosed(1,a).filter(v-> a % v == 0).boxed()
                            .collect(Collectors.toSet());
       
        System.out.println("분모 :"+Arrays.toString(bArr));
        System.out.println("분자 :"+aSet);
        
        List<Integer>li = Arrays.stream(bArr).filter(v -> aSet.contains(v)).boxed()
                            .collect(Collectors.toList());
        
        int c = li.get(li.size()-1);
        System.out.println(li.get(li.size()-1));
        
        int d = (b/c);
        
        
        while (d % 2 == 0) d /= 2;
        while (d % 5 == 0) d /= 5;
        
        if(d==1) return 1;
        else return 2;
        
    }
}