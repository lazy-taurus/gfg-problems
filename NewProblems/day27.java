public class day27 {
    static int determinantOfMatrix(int matrix[][], int n)
    {
        // code here 
        int det=0;
        if(n==1) return matrix[0][0];
        for(int i=0; i<n; i++){
            int[][] inMat = new int[n-1][n-1];
            for(int j=1, k=0; j<n; j++, k++){
                for(int l=0, m=0; l<n; l++){
                    if(l==i) continue;
                    inMat[k][m]=matrix[j][l];
                    m++;
                }
            }
            det+=Math.pow(-1, i)*matrix[0][i]*determinantOfMatrix(inMat, n-1);
        }
        return det;
    }
}