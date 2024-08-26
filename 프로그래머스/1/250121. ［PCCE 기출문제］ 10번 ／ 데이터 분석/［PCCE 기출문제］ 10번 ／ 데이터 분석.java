import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        ArrayList<int[]>li=new ArrayList<>();
        int extnum = codename(ext);
        int sortnum = codename(sort_by);
        int cnt=0;
        for(int i =0;i<data.length;i++){
            if(data[i][extnum]<val_ext){
                li.add(data[i]);
            }
        }
        Collections.sort(li, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[sortnum], b[sortnum]); 
            }
        });
       
        int[][] answer = new int[li.size()][];
        for (int i = 0; i < li.size(); i++) {
            answer[i] = li.get(i); 
        }
        
        
        return answer;
    }
    private int codename(String str){
        if(str.equals("code")) return 0;
        else if(str.equals("date")) return 1;
        else if(str.equals("maximum")) return 2;
        else return 3;
    } 
}