import java.util.ArrayList;

public class pascalTriangle {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Long> arr = new ArrayList<>();
        int mod = 1000000007;
        arr.add((long)1);
        if(n==1) {
            return arr;
        }
        arr.add((long)1);
        if(n==2) {
            return arr;
        }
        for(int i=2;i<n;i++) {
            ArrayList<Long> temp = new ArrayList<>();
            temp.add((long)1);
            for(int j=0;j<arr.size()-1;j++) {
                temp.add((arr.get(j)+arr.get(j+1))%mod);
            }
            temp.add((long)1);
            arr = temp;
        }
        return arr;
        
        // arr.add((long)1);
        // if(n==1) {
        //     return arr;
        // }
        // arr.add((long)1);
        // if(n==2) {
        //     return arr;
        // }
        // for(int i=2;i<n;i++) {
        //     ArrayList<Long> temp = new ArrayList<>();
        //     temp.add((long)1);
        //     for(int j=0;j<arr.size()-1;j++) {
        //         temp.add(arr.get(j)+arr.get(j+1));
        //     }
        //     temp.add((long)1);
        //     arr = temp;
        // }
        // return arr;
    }
    public static void main(String[] args) {
        
    }
}
