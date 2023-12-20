import java.util.ArrayList;

public class subarraysInRange {

    static long countSubarrays(int a[], int n, int L, int R)  
    { 
        // Complete the function
        long count = 0, pr = 0, prel = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] < L) {
                count += pr;
                prel++;
            } else if(a[i] > R) 
                pr = prel = 0;
            else {
                count += (pr + prel + 1);
                pr += prel + 1;
                prel = 0;
            }
        }
        
        return count;
        
    }
    public static ArrayList<Integer> inRange(int[] arr, int L, int R){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > L && arr[i] < R){
                list.add(arr[i]);
            }
        }
        return list;
    }

}