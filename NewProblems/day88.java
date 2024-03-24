
public class day88 {

    public int maxSum(int n) 
    { 
        if(n==0) return 0;
        int by2= maxSum(n/2);
        int by3= maxSum(n/3);
        int by4= maxSum(n/4);
        return Math.max(n,(by2+by3+by4));
    } 
}