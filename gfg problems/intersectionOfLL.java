public class intersectionOfLL {
    public static void main(String[] args) {
        
    }
    public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node temp1 = null;
        Node temp2 = null;
        while (head1!=null && head2!=null) {
            if(head1.data == head2.data) {
                if(temp1 == null) {
                    temp1 = new Node(head1.data);
                    temp2 = temp1;
                } else {
                    temp1.next = new Node(head1.data);
                    temp1 = temp1.next;
                }
                head1 = head1.next;
                head2 = head2.next;
            } else if(head1.data < head2.data) {
                head1 = head1.next;
            } else {
                head2 = head2.next;
            }
        }
        return temp2;
    }
}
class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
