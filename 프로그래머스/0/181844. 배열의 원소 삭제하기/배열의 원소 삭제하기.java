import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        for(int d : delete_list){
            deleteSet.add(d);
        }

        List<Integer> answer = new ArrayList<>();
        for (int a : arr) {
            if (!deleteSet.contains(a)) {
                answer.add(a);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
