/**
 * day38
 */
public class day38 {

    public int TotalWays(int N)
    {
        // Code here
        long a1=2;
        long a2=3;
        for (int i=1; i<N; i++){
            long temp=(a1+a2)% 1000000007;
            a1=a2;
            a2=temp;
        }
        return (int) ((a1*a1)% 1000000007);
    }
}