import java.util.ArrayList;

public class day55 {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        solve(root, sum, new ArrayList<>());
        return res;
    }
    public static void solve(Node root, int sum, ArrayList<Integer> arr){
        if (root==null) {
            return;
        }
        arr.add(root.data);
        sum-= root.data;
        if (sum==0) {
            res.add(arr);
        }
        ArrayList<Integer> temp = new ArrayList<>(arr);
        ArrayList<Integer> temp2 = new ArrayList<>(arr);
        solve(root.right, sum, temp);
        solve(root.left, sum, temp2);
        return;
    }
}
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
