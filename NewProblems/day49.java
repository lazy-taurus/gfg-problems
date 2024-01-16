public class day49 {
    static int numberSequence(int m, int n)
    {
        // code here
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0 || i<j){
                    dp[i][j] = 0;
                }
                else if(j==1){
                    dp[i][j] = i;
                }
                else{
                    dp[i][j] = dp[i-1][j] + dp[i/2][j-1];
                }
            }
        }
        return dp[m][n];
    }
}
