import java.util.*;

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
            boolean isHigher = false;

            // 대기열에 남은 문서들 중 더 높은 중요도 있는지 확인
            for (int i : wait) {
                if (priorities[i] > priorities[idx]) {
                    isHigher = true;
                    break;
                }
            }

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
