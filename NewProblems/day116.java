/**
 * day116
 */
public class day116 {

    int[] Series(int n) {
        // code here
        int fir=0, sec=1, temp=0;
        int[] ans=new int[n+1];
        for (int i = 0; i <= n; i++) {
            ans[i]=fir;
            temp=sec;
            sec+=fir;
            sec%=1000000007;
            fir=temp;
        }
        return ans;
    }
}