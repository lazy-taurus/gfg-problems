public class day29 {
    static int[] antiDiagonal(int matrix[][], int n)
    {
        // code here 
        int[] arr = new int[n*n];
        int k=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                arr[k++]=matrix[j][i-j];
            }
        }
        for(int i=1; i<n; i++){
            for(int j=n-1; j>=i; j--){
                arr[k++]=matrix[i+n-j-1][j];
            }
        }
        return arr;

    }
}
