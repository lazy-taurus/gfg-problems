public class day34 {
    public boolean canPair(int[] nums, int k) {
        // Code here
        if(nums.length%2 == 1) return false;
        int[] arr = new int[k];
        for(int i=0; i<nums.length; i++) arr[nums[i]%k]++;
        int j=1, n=k-1;
        if(arr[0]%2==1) return false;
        while(j<=n){
            if(arr[j]!=arr[n]) return false;
            j++; n--;
        }
        return true;
    }
}
