import java.util.Queue;

public class day45 {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        int[] arr = new int[k];
        for (int index = 0; index < k; index++) {
            arr[index] = q.remove();
        }
        for (int index = k-1; index >= 0; index--) {
            q.add(arr[index]);
        }
        for (int index = 0; index < q.size()-k; index++) {
            q.add(q.remove());
        }
        return q;
    }
}
