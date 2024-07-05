import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 1;
        String [] num = dartResult.split("[S,D,T,#,*]");
        String [] sdt = dartResult.replaceAll("[0,1,2,3,4,5,6,7,8,9,10]"," ")
                        .split(" ");
        String [] op =Arrays.stream(sdt).filter(i->!i.isEmpty())
                     .toArray(String[]::new);
        List<Integer>li =Arrays.stream(num).filter(i->!i.isEmpty())
                                .mapToInt(Integer::parseInt).boxed()
                                .collect(Collectors.toList());
        for(int i=0;i<op.length;i++){
            int n = li.get(i);
            if(op[i].contains("D")){
                li.set(i,n*n);
            }
            if(op[i].contains("T")){
                li.set(i,(n * n)* n);
            }
            if(op[i].contains("*")&&i!=0){
                li.set(i-1,li.get(i-1)*2);
                li.set(i,li.get(i)*2);
            }else if(op[i].contains("*")&&i==0){
                li.set(i,li.get(i)*2);
            }
            if(op[i].contains("#")){
                li.set(i,li.get(i)*-1);
            }
        }
        return li.stream().mapToInt(Integer::intValue).sum();
    }
}
