import java.util.Arrays;

public class day43 {
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
        for (int i = 1; i < n; i++) {
            a[i] += a[i-1];
        }
        for (int i = 0; i < n; i++) {
            a[i] = a[i]%k;
        }
        int max = 0;
        int[] arr = new int[k+1];
        Arrays.fill(arr, -1);
        for (int i = 0; i < n; i++) {
            if (a[i]<0) a[i] += k;
            if (a[i] == 0) max = Math.max(max, i+1);
            else if(arr[a[i]]==-1) arr[a[i]] = i;
            else max = Math.max(max, i - arr[a[i]]);
        }
        return max;
       
    }
    
}
