/**
 * day39
 */
public class day39 {

    public static long sumOfPowers(long a, long b) {
        // code here
        long ans = 0;
        for (long i = a; i <= b; i++) {
            long temp = i;
            for (long j = 1; j*j < i; j++) {
                while (temp%j == 0) {
                    temp/=j;
                    ans++;
                }
            }
            if (temp > 1) {
                ans++;
            }
        }
        return ans;
    }
}