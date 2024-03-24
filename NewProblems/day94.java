public class day94 {
    public int peakElement(int[] arr,int n)
    {
       //add code here.
       for(int i=0; i<n-1; i++){
           if(arr[i]>=arr[i+1]){
               return i;
           }
       }
       return n-1;
    }
}
