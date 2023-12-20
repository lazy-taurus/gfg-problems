public class gameOfNim {

    public static void main(String[] args) {
        int n = 4;
        int A[] = {1, 2, 3, 4};
        System.out.println(findWinner(n, A));
    }

    static int findWinner(int n, int A[]){
        // code here
        int win =1;
        int com =0;
        for(int i=0; i<n; i++)com^=A[i];
        if(com==0)return 1;
        else com=0;
        for(int i=0; i<n; i++){
            if(A[i]>=0){
                int j = i;
                while(true){
                    if(A[j]==A[i]){
                        com++;
                        A[j]=-1;
                    }
                    j++;
                    if(j==n)break;
                }
                if (com%2==1){
                    win++;
                }
                com=0;
            }
        }
        return win%2 + 1;
    }
}