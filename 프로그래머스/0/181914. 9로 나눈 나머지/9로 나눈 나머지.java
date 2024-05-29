import java.math.*;
class Solution {
    public int solution(String number) {
        
        BigInteger b = new BigInteger(number);
        BigInteger modResult = b.mod(BigInteger.valueOf(9));

        return modResult.intValue();
    }
}