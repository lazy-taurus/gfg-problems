class Node{
    int data;
    Node left;
    Node right;
}
public class day80 {
    
    public Node flattenBST(Node root) {
        if(root == null) return null;
        root.left = flattenBST(root.left);
        root.right = flattenBST(root.right);
        root = merge( root , root.left);
        root.left = null;
        return root;
    }
    static Node merge(Node right, Node left){
        if (left == null) return right;
        if (right == null) return left;

        Node result;
        if (left.data < right.data) {
            result = left;
            result.right = merge(left.right, right);
        } else {
            result = right;
            result.right = merge(left, right.right);
        }
        return result;
    }
}