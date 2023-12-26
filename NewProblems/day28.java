import java.util.ArrayList;
import java.util.HashMap;

public class day28 {
    public static void main(String[] args) {
        int[][] inputMatrix = {
{1, 2 ,3},
{-3, -2, -1},
{1, 7 ,5}
        };
        ArrayList<ArrayList<Integer>> result = sumZeroMatrix(inputMatrix);
        System.out.println(result);
    }
    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int best = 0;
        int sx, ex, sy, ey;
        sx = ex = sy = ey = 0;

        for(int i=0;i<m;i++){
            int[] temp = new int[n];
            for(int j=i;j<m;j++){
                for(int k=0;k<n;k++){
                    temp[k] += a[k][j];
                }
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, -1);
                int csum = 0;
                for(int k=0;k<n;k++){
                    csum += temp[k];
                    if(map.containsKey(csum)){
                        System.out.println(csum+"!!!!!!!!");
                        int area = (j-i+1)*(k-map.get(csum));
                        if(area > best){
                            best = area;
                            sy = map.get(csum)+1;
                            ey = k;
                            sx = i;
                            ex = j;
                            System.out.println(sy+" "+ey+" "+sx+" "+ex);

                        }
                    }
                    else{
                        map.put(csum, k);
                    }

                }
                csum = 0;
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (best == 0) {
            return ans;
        }
        for(int i= sy;i<= ey;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j= sx;j<= ex;j++){
                temp.add(a[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }
}
