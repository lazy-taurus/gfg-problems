public class kAlmostPrime {
    public static void printKAlmostPrime(int k, int N){
        // int[] numbers = new int[N];
        int[] prime = new int[N];

        int x = 2;
        int y = 0;

        for(int i = 0; i <= N; i++){
            int count = 0;

            for(int j = 1; j <= x; j++)
               if(x%j == 0)
                count++;

            if(count == 2)
              prime[y] = x;
                y++;

            x++;
        }
        int numFound = 0;
        int currNum = 0;
        while(numFound<N){
            int count = 0;
            for(int i = 0; i < N; i++){
                if(prime[i] != 0 && currNum%prime[i] == 0)
                    count++;
            }
            if(count == k){
                
                System.out.print(currNum+" ");
                numFound++;
            }
            currNum++;
        }

    }
    public static void main(String[] args) {

        printKAlmostPrime(2, 10);
        
    }
}
