
public class day46 {
    /**
     * Node
     */
    public class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node insertionSort(Node head_ref)
    {
        
        
        if(head_ref==null || head_ref.next==null) return head_ref;
        
        Node i = head_ref.next;
        Node j = head_ref;
        
        int curr = 0;
        int prev = head_ref.data;
        int i_index = 1;
        int j_index = 0;
        
        while(i!=null) {
            if(i.data<prev){
                prev = i.data;
                while(j.data<=prev) {
                    j = j.next;
                    j_index++;
                }
                
                while(j_index<=i_index){
                    curr = j.data;
                    j.data = prev;
                    prev = curr;
                    j = j.next;
                    j_index++;
                }
                
                j = head_ref;
                j_index = 0;
            }
            prev = i.data;
            i = i.next;
            i_index++;
        }
        
        return head_ref;  
    }
}
