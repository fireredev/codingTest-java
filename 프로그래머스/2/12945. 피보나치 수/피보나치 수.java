class Solution {
    public int solution(int n) {
    int a = 0, b = 1, c;
    if (n == 0) return a;
    for (int i = 2; i <= n; i++) {
        c = (a + b) % 1234567; // 여기에서 모듈로 연산을 적용
        a = b;
        b = c;
    }
    return b;
}

}