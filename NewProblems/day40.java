public class day40 {
    static int splitArray(int[] arr , int N, int K){
        int max = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int low = max;
        int high = sum;
        int ans = 0;
        while (low<=high) {
            int mid = (low+high)/2;
            if (isValid(arr, N, K, mid)) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
    static boolean isValid(int[] arr, int N, int K, int mid) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (sum>mid) {
                sum = arr[i];
                count++;
            }
        }
        return count<=K;
    }
}