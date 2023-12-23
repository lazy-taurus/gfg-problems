import java.util.*;

public class day26 {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = price[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        int ans = 0;
        for(int i=0;i<n;i++){
            while (k >= arr[i][0] && arr[i][1] > 0) {
                ans++;
                k -= arr[i][0];
                arr[i][1]--;
            }
        }
        return ans;
    }
}
