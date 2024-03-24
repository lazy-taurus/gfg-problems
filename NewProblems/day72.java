public class day72 {
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Solution
{
    boolean check(Node root)
    {
        return checkUtil(root, 0, 0);	
    }
    boolean checkUtil(Node root, int level, int leafLevel)
    {
        if (root == null) return true;
        if (root.left == null && root.right == null)
        {
            if (leafLevel == 0)
            {
                leafLevel = level;
                System.out.println("level: " + level);
                System.out.println("leafLevel: " + leafLevel);
                return true;
            }
            System.out.println("level: " + level);
            System.out.println("leafLevel: " + leafLevel);
            return (level == leafLevel);
        }
        return checkUtil(root.left, level + 1, leafLevel) && checkUtil(root.right, level + 1, leafLevel);
    }
    
}
}
