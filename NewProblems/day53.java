public class day53 {
    public static void main(String[] args) {
        
    }
    public static int distributeCandy(Node root)
    {
        //code here
        if(root == null) return 0;
        int ans = 0;
        ans += distributeCandy(root.left);
        if (root.left != null && root.left.data != 1) {
            int diff = root.left.data - 1;
            root.data += diff;
            ans += Math.abs(diff);
            root.left.data = 1;   
        }
        ans += distributeCandy(root.right);
        if (root.right != null && root.right.data != 1) {
            int difr = root.right.data - 1;
            root.data += difr;
            ans += Math.abs(difr);
            root.right.data = 1;
        }
        return ans;        
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
