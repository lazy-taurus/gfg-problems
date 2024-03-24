import java.util.ArrayList;

public class day106 {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0; i< (2*n)-1;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int k=Math.min(i,n-1), j=Math.max(i-n+1, 0);
            while(j<n && k>=0){
                temp.add(mat[j++][k--]);
            }
            arr.add(temp);
        }
        int[] ans = new int[n*n];
        int index=0;
        boolean reverse =true;
        // System.out.println(arr);
        
        for(int i=0; i< arr.size(); i++){
            if(reverse){
                for(int j = arr.get(i).size() -1; j>=0; j--){
                    ans[index++]=arr.get(i).get(j);
                    reverse = false;
                }
            }
            else{
                for(int j = 0; j<arr.get(i).size() ; j++){
                    ans[index++]=arr.get(i).get(j);
                    reverse = true;
                }
            }
        }
        return ans;
    }
}
