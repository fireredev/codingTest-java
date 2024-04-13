class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int [photo.length];
        int pint=0;
        
        int p = 0;
        for(String [] arr : photo){
            
            for(int i =0;i<arr.length;i++){
               
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