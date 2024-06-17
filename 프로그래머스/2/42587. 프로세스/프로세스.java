import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayDeque<Integer> wait = new ArrayDeque<>();
        ArrayDeque<Integer> proc = new ArrayDeque<>();

        // 대기열에 문서 추가
        for (int i = 0; i < priorities.length; i++) {
            wait.add(i);
        }
        // 대기열에서 문서 꺼내기
        while (!wait.isEmpty()) {
            int idx = wait.poll();
            boolean isHigher = IntStream.range(0, wait.size())
                              .mapToObj(i -> wait.toArray()[i])
                              .mapToInt(i -> priorities[(int)i])
                              .anyMatch(p -> p > priorities[idx]);
            if (isHigher) {
                wait.addLast(idx);
            } else {
                proc.add(idx);
                if (idx == location) {
                    answer = proc.size();
                    break;
                }
            }
        }
        return answer;
    }
}
