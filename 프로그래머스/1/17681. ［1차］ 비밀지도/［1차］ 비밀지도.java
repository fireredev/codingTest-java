import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n] ;
        String[] fMap = Arrays.stream(arr1).mapToObj(Integer::toBinaryString).toArray(String[]::new);
        String[] sMap = Arrays.stream(arr2).mapToObj(Integer::toBinaryString).toArray(String[]::new);
        
        for(int i =0;i<fMap.length;i++){
            answer[i]=String.valueOf(Long.parseLong(fMap[i])+Long.parseLong(sMap[i]));
            String zero="0";
            if(answer[i].length()!=n) answer[i]=zero.repeat(n-answer[i].length())+answer[i];
            answer[i]=answer[i].replaceAll("[1-9]","#").replaceAll("0"," ");
        }
        
        return answer;
    }
}