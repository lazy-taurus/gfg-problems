public class kAlmostPrime2 {
    // public static void printRequired(int k, int N){
        
    // }
    public static void main(String[] args){
        // printRequired(2, 10);
        int N = 1;
        int k = 2;

        int numGot = 0;
        int currNum = 2;
        while(numGot<N){
            int count = 0;
            for(int i = 2; i <= currNum; i++){
                int x = currNum;
                if(x%i == 0)
                    x = x/i;
                    count++;
            }
            if(count == k){
                System.out.print(currNum+" ");
                numGot++;
            }
            currNum++;
        }
    }
}
