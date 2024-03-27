class Solution {
    public String solution(String s) {
        String[] str = s.split(" ", -1);
        String answer = "";
        for (String word : str) {
            char[] cArr = word.toCharArray();
            for (int i = 0; i < cArr.length; i++) {
                if (i % 2 == 0) {
                    cArr[i] = Character.toUpperCase(cArr[i]);
                } else {
                    cArr[i] = Character.toLowerCase(cArr[i]);
                }
            }
            answer += new String(cArr) + " ";
        }
        return answer.substring(0, answer.length() - 1);
    }
}
