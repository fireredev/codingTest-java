import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int removedDollsCount = 0;

        for (int move : moves) {
            int doll = getDoll(board, move);
            if (doll != 0) {
                if (!stack.isEmpty() && stack.peek() == doll) {
                    stack.pop(); // 같은 인형이면 제거
                    removedDollsCount += 2; // 제거된 두 인형 카운트
                } else {
                    stack.push(doll); // 다른 인형이면 추가
                }
            }
        }

        return removedDollsCount; // 제거된 인형의 개수 반환
    }

    private int getDoll(int[][] board, int move) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][move - 1] != 0) {
                int doll = board[row][move - 1];
                board[row][move - 1] = 0; // 해당 위치를 비움
                return doll; // 뽑은 인형 반환
            }
        }
        return 0; // 인형이 없으면 0 반환
    }
}
