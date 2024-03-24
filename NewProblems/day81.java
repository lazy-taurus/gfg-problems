public class day81 {
    public boolean countSub(long arr[], long n)
    {
        int k = (int)n;
        for(int i=k-1;i>0;i--){
            if(arr[i]>arr[(i-1)/2]) return false;
        }
        return true;
    }
}
