import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        // 00000
        // 00103
        // 02501
        // 42442
        // 35131
        //move배열대로 만들어야함 리스트
        List<Integer>li=new ArrayList<>();
        for(int i: moves){
            for(int k=0;k<board.length;k++){
                if(board[k][i-1] != 0) {
                    li.add(board[k][i-1]);
                    board[k][i-1]=0;
                    break;
                }
            }
        }
        Stack<Integer> s =new Stack<>();
        for(int i: li){
            if(s.isEmpty() || s.peek()!=i) {
                s.push(i);
            }else {
                s.pop();
            }
        }
        return li.size()-s.size();
    }
}