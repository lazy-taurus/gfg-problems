public class day30 {
    public static void main(String[] args) {
        
    }
    static boolean match(String wild, String pattern)
    {
        // code here
        int n = wild.length();
        int m = pattern.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for(int i=1; i<=m; i++){
            if(pattern.charAt(i-1) == '*'){
                dp[0][i] = dp[0][i-1];
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(wild.charAt(i-1) == pattern.charAt(j-1) || wild.charAt(i-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(wild.charAt(i-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
    return dp[n][m];
    }
}