class Solution {
    public String solution(String new_id) {
        // 1. 소문자로 변환
        new_id = new_id.toLowerCase();
        
        // 2. 알파벳, 숫자, -, _, .을 제외한 모든 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // 3. ".."가 있을 경우 하나의 "."로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        // 4. 처음과 끝의 마침표 제거
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        
        // 5. 빈 문자열이면 "a"로 설정
        if (new_id.isEmpty()) {
            new_id = "a";
        }
        
        // 6. 길이가 15자 이상일 경우 잘라내기
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
        }
        
        // 끝에 마침표가 있으면 제거
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        
        // 7. 길이가 2자 이하일 경우 마지막 문자를 반복하여 3자로 만들기
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        
        return new_id; // 결과 반환
    }
}
