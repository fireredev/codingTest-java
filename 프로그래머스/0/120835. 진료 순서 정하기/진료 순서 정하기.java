import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] cl = emergency.clone();
        Arrays.sort(cl);        
        int[] rank = new int[cl.length];
        for (int i = 0; i < cl.length; i++) {
            rank[i] = cl.length - i;
        }
        int[] result = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < cl.length; j++) {
                if (emergency[i] == cl[j]) {
                    result[i] = rank[j];
                }
            }
        }
        return result;
    }
}
