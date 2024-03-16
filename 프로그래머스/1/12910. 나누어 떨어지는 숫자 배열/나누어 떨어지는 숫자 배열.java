import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> li= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0) li.add(arr[i]);
        }
        if(li.isEmpty()) li.add(-1);
        li.sort(Comparator.naturalOrder());
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}