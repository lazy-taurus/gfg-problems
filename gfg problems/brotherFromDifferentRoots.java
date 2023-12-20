import java.util.ArrayList;

public class brotherFromDifferentRoots {

    public class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
    public static void main(String[] args) {
        
    }
    public static ArrayList<Integer> turnArray(Node root)
	{
		ArrayList<Integer> arr = new ArrayList<>();
        if(root == null)
            return arr;
        arr.addAll(turnArray(root.left));
        arr.add(root.data);
        arr.addAll(turnArray(root.right));
        return arr;
	}
    public static int findPairs(ArrayList<Integer> arr, Node root, int x){
        if(root == null)
            return 0;
        int i = 0;
        i+=findPairs(arr, root.left, x);
        if(arr.contains(x-root.data)) i++;
        i+=findPairs(arr, root.right, x);
        return i;
        
    }
    public static int countPairs(Node root1, Node root2, int x)
	{
		// Code here
        ArrayList<Integer> arr1 = turnArray(root1);

        return findPairs(arr1, root2, x);
    }

}
