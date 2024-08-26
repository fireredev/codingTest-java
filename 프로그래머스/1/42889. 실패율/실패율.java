import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stageCounts = new int[N + 2]; // 각 스테이지에서 실패한 플레이어 수
        int totalPlayers = stages.length;

        // 각 스테이지의 실패자 수 계산
        for (int stage : stages) {
            if (stage <= N) {
                stageCounts[stage]++;
            }
        }

        // 실패율 계산
        Map<Integer, Double> failureRates = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            if (totalPlayers > 0) {
                failureRates.put(i, (double) stageCounts[i] / totalPlayers);
                totalPlayers -= stageCounts[i]; // 다음 스테이지의 총 플레이어 수 감소
            } else {
                failureRates.put(i, 0.0); // 실패자가 없을 경우
            }
        }

        // 실패율 기준으로 정렬
        List<Map.Entry<Integer, Double>> sortedList = new ArrayList<>(failureRates.entrySet());
        sortedList.sort((entry1, entry2) -> {
            int valueComparison = entry2.getValue().compareTo(entry1.getValue());
            return valueComparison != 0 ? valueComparison : entry1.getKey().compareTo(entry2.getKey());
        });

        // 정렬된 스테이지 번호 반환
        return sortedList.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}
