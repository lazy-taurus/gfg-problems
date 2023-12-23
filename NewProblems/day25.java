import java.util.HashMap;

public class day25 {

    public static void main(String[] args){

    }

    
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);}
        
        int count = 0;
        for(int i : map.keySet()){
            if(map.get(i) > n/k)
                count++;
        }
        return count;

        
    }
}
