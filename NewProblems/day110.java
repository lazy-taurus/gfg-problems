import java.util.HashSet;
import java.util.LinkedList;

public class day110 {
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        while (head1.size()>0) {
            set.add(head1.getFirst());
            head1.removeFirst();
        }
        while (head2.size()>0) {
            if (set.contains(x-head2.getFirst())) count++;
            head2.removeFirst();
        }
        return count;
    }
}
