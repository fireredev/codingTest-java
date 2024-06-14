import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Map<Integer, Integer> scoreMap = IntStream.range(0, answers.length)
                .boxed()
                .collect(Collectors.toMap(
                        i -> 1,
                        i -> (answers[i] == one[i % one.length]) ? 1 : 0,
                        Integer::sum
                ));

        scoreMap.put(2, IntStream.range(0, answers.length)
                .map(i -> (answers[i] == two[i % two.length]) ? 1 : 0)
                .sum());

        scoreMap.put(3, IntStream.range(0, answers.length)
                .map(i -> (answers[i] == three[i % three.length]) ? 1 : 0)
                .sum());

        int maxScore = scoreMap.values().stream().max(Integer::compareTo).get();

        return scoreMap.entrySet().stream()
                .filter(e -> e.getValue() == maxScore)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
