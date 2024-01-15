import java.util.ArrayList;
import java.util.HashSet;

public class day47 {
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            int num=0;
            for(int j=0;j<n;j++) num=(num*2)+matrix[i][j];
            if (set.contains(num)) ans.add(i);
            else set.add(num);
        }
        return ans;
    }
}