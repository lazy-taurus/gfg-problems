
public class predictColumn {

    public int stpredictColumn(int matrix[][], int N) {
        
        int result = -1;
        for(int j = 0; j < N; j++){
            int count = 0;
            int prevCount = 0;
            for(int i = 0; i < N; i++){
                if(matrix[i][j] == 0){
                    count++;
                }
            }
            if(count > prevCount){
                prevCount = count;
                result = j;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}