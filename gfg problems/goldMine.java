public class goldMine {

    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int max = 0;
        for(int i = 0; i < m; i++){
            int temp = threePath(0, i, M);
            if(temp > max){
                max = temp;
            }
        }
        return max;
        
    }
    static int threePath(int i, int j, int M[][]){
        int sum = 0;
        if(i == M.length-1){
            return M[i][j];
        }
        if(j == 0){
            sum = Math.max(threePath(i+1, j, M), threePath(i+1, j+1, M));
        }
        else if(j == M[0].length-1){
            sum = Math.max(threePath(i+1, j, M), threePath(i+1, j-1, M));
        }
        else{
            sum = Math.max(threePath(i+1, j, M), Math.max(threePath(i+1, j-1, M), threePath(i+1, j+1, M)));
        }

        
        return sum;
    }
}