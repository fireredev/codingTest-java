import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger bigBalls = BigInteger.valueOf(balls);
        BigInteger bigShare = BigInteger.valueOf(share);
        
    	return factorial(bigBalls).divide(factorial(bigBalls.subtract(bigShare)).multiply(factorial(bigShare)));
    }
    
    public static BigInteger factorial(BigInteger n) {
        if(n.intValue() <= 1)
        {
        	return BigInteger.ONE;
        }
    
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}