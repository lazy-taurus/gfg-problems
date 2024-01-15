/**
 * Node
 */
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class day41 {
     Node mergeResult(Node node1, Node node2){
        Node prev = null;
        Node curr = null;
        Node next = null;
        while (node1 != null || node2 != null) {
            if (node1 != null && node2 != null) {
                if (node1.data < node2.data) {
                    curr = node1;
                    next = node1.next;
                    curr.next = prev;
                    prev = curr;
                    node1 = next;
                } else {
                    curr = node2;
                    next = node2.next;
                    curr.next = prev;
                    prev = curr;
                    node2 = next;
                }
            }
            else if (node1 != null) {
                curr = node1;
                next = node1.next;
                curr.next = prev;
                prev = curr;
                node1 = next;
            }
            else {
                curr = node2;
                next = node2.next;
                curr.next = prev;
                prev = curr;
                node2 = next;
            }
        }
        return curr;

     }
}
