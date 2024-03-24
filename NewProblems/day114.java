import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
public class day114 {
    ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        ArrayList<Integer> index= new ArrayList<>();
	    ArrayList<Integer> ans= new ArrayList<>();
        Queue<Node> line = new LinkedList<>();
        int take=0;
        int i=0;
        index.add(0);
        line.add(root);
        Node temp;
        while (!line.isEmpty()) {
            temp=line.poll();
            i=index.get(take);
            if (arr.size()==i) {
                arr.add(new ArrayList<>());
            }
            arr.get(i).add(temp.data);
            if (temp.left!=null) {
                line.add(temp.left);
                index.add(index.get(take)+1);
            }
            if (temp.right!=null) {
                line.add(temp.right);
                index.add(index.get(take)+1);
            }
            take++;
        }
        for (int j = 0; j < arr.size(); j++) {
            for (int j2 = 0; j2 < arr.get(j).size(); j2++) {
                if (j%2==0) {
                    ans.add(arr.get(j).get(j2));
                } else{
                    ans.add(arr.get(j).get(arr.get(j).size()-1-j2));
                }
            }
        }
        return ans;
	}
}
