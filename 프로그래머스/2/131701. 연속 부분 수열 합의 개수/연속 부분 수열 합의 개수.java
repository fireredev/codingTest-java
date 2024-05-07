import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> uniqueSums = new HashSet<>();
        
        int n = elements.length;
        // 원형 수열을 처리하기 위해 길이의 2배를 가진 배열 생성
        int[] extendedElements = new int[n * 2];
        for (int i = 0; i < n; i++) {
            extendedElements[i] = elements[i];
            extendedElements[i + n] = elements[i];
        }
        
        // 모든 가능한 연속 부분 수열의 합을 계산
        for (int start = 0; start < n; start++) { // 시작점
            for (int len = 1; len <= n; len++) { // 부분 수열의 길이
                int sum = 0;
                for (int i = start; i < start + len; i++) {
                    sum += extendedElements[i];
                }
                uniqueSums.add(sum);
            }
        }
        
        // 중복을 제거한 합의 개수 반환
        return uniqueSums.size();
    }
}
