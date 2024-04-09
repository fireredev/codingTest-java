public class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 최대공약수(GCD)를 찾는 함수
        int gcd = gcd(denom1, denom2);
        // 최소공배수(LCM) 계산
        int lcm = (denom1 * denom2) / gcd;
        
        // 두 분수의 분자를 조정하여 합산
        int numerator = numer1 * (lcm / denom1) + numer2 * (lcm / denom2);
        
        // 결과 분수의 최대공약수 찾기 (기약분수로 만들기 위해)
        int resultGCD = gcd(numerator, lcm);
        
        return new int[] { numerator / resultGCD, lcm / resultGCD };
    }
    
    // 유클리드 알고리즘을 사용하여 최대공약수(GCD)를 계산하는 함수
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
