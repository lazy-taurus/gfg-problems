import java.util.Arrays;

public class day48 {
    public int max_courses(int n, int total, int[] cost) {
        // code here
        int[][] dp=new int[n+1][total+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return help(n,0,total,cost,dp);
    }
    public int help(int n,int i,int total,int[] cost,int[][] dp){
        if (i>=n){
            return 0;
        }
        if (dp[i][total]!=-1){
            return dp[i][total];
        }
        if (cost[i]>total){
            return dp[i][total]=help(n,i+1,total,cost,dp);
        }else{
            return dp[i][total]=Math.max(help(n,i+1,total,cost,dp),1+help(n,i+1,total-cost[i]+(int)Math.floor(0.9*cost[i]),cost,dp));
        }
    }
}
