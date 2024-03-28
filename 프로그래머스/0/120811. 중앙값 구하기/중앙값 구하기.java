import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        answer = (array.length-1)/2;
        array=Arrays.stream(array).sorted().toArray();

        return array[answer];
    }
}