import java.util.*;

public class day50 {

    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        Collections.sort(arr);
        HashSet<ArrayList<Integer>> ans = new HashSet<>();
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[n];
        permute(arr, ans, temp, visited);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(ArrayList<Integer> a : ans){
            res.add(a);
        }
        Collections.sort(res, (a, b) -> {
            for (int i = 0; i < n; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        return res;
    }
    static void permute(ArrayList<Integer> arr, HashSet<ArrayList<Integer>> ans, ArrayList<Integer> temp, boolean[] visited){
        if(temp.size() == arr.size() && !ans.contains(temp)){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.size();i++){
            if(!visited[i]){
                visited[i] = true;
                temp.add(arr.get(i));
                permute(arr, ans, temp, visited);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }
}