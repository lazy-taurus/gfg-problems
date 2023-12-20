public class commonSequence {
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        String[][] common= new String[m][n];        
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                
                if(X.charAt(i)==Y.charAt(j)){
                    common[i][j]=""+X.charAt(i);
                }
            }
        }

        return n;
    }
    public static void main(String[] args) {
        
    }

}