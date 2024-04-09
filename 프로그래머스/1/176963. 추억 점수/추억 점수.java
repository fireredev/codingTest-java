class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int [photo.length];
        int pint=0;
        //photo 배열순회
        int p = 0;
        for(String [] arr : photo){
            // arr(photo행) 순회 
            for(int i =0;i<arr.length;i++){
                //name배열 순회
                for(int j=0;j<name.length;j++){
                    if(arr[i].equals(name[j])) {
                        pint += yearning[j];
                    } 
                }
            }
            answer[p++] =pint;
            pint=0;
        }
        return answer;
    }
}