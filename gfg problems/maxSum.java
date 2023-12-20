import java.util.ArrayList;

public class maxSum {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long sum=0;
        for(int i=0; i<K; i++){
            sum+=Arr.get(i);
        }
        long temp=sum;
        for(int j=0; j+K<N; j++){
            temp=temp-Arr.get(j)+Arr.get(j+K);
            if(temp>sum){
                sum=temp;
            }
        }
        return sum;
    }
}
