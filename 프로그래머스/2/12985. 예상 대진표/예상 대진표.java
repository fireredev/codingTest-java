class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        double dA = a;
        double dB = b;
        while(n!=1){
            System.out.println("answer "+answer);
            answer++;
            System.out.println("n"+n);
            dA = Math.ceil(dA/2);
            System.out.println("a "+dA);
            dB = Math.ceil(dB/2);
            System.out.println("b "+dB);
            n/=2;
            if(dA == dB) break;
            System.out.println("=======");
        }    
        

        return answer;
    }
}