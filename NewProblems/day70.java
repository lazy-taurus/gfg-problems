/**
 * day70
 */
/**
 * Innerday70
 */
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
public class day70 {
    int printKDistantfromLeaf(Node root, int k)
    {
        printKDistantfromLeaf(root.left, k-1);
        
    }
    

}