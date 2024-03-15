import java.lang.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int [2];
        int x =0;
        int y =0;
        for(int i =0;i<keyinput.length;i++){
            if(keyinput[i].equals("up") && board[1]/2 >= Math.abs(y+1)) y++;
            else if(keyinput[i].equals("down") && board[1]/2 >= Math.abs(y-1)) y--;
            else if(keyinput[i].equals("right") && board[0]/2 >= Math.abs(x+1)) x++;
            else if(keyinput[i].equals("left") && board[0]/2 >= Math.abs(x-1)) x--;
        }
        if(board[0]/2<=Math.abs(x)) {
            if(Math.abs(x)==x) {
                x=board[0]/2;
            }else{
                x=-1*(board[0]/2);
            }    
        }
        if(board[1]/2<=Math.abs(y)) {
            if(Math.abs(y)==y) {
                y=board[1]/2;
            }else{
                y=-1*(board[1]/2);
            }    
        }
        answer[0]=x;
        answer[1]=y;
        return answer;
    }
}
