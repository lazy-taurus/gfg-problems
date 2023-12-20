

public class missingInArray {
    public static void main(String[] args) {
        
    }
    int missingNumber(int array[], int n) {
        int sum = n*(n+1)/2;
        // Your Code Here
        for(int i=0;i<n-1;i++){
            sum-=array[i];
        }
        return sum;
    }
}
