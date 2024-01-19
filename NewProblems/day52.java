import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class day52 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 2};
        int N = 5;
        int K = 4;
        ArrayList<ArrayList<Integer>> ans = kTop(arr, N, K);
        System.out.println(ans);
        for(int i = 0; i < ans.size(); i++){
            for(int j = 0; j < ans.get(i).size(); j++){ 
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> kTop(int[] arr, int N, int K) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int[] freq = new int[101];
        
        for (int i = 0 ; i < N ; i++) {
            freq[arr[i]]++;
            
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
                int x = freq[a];
                int y = freq[b];
                
                if (x == y) {
                    return b-a;
                } else {
                    return x-y;
                }
            });
            
            int size = 0;
            
            for (int j = 0 ; j < 101 ; j++) {
                if (freq[j] == 0) {
                    continue;
                }
                
                pq.offer(j);
                size++;
                
                if (size > K) {
                    pq.poll();
                    size--;
                }
            }
            
            ArrayList<Integer> list = new ArrayList<>();
            while (!pq.isEmpty()) {
                list.add(pq.poll());
            }
            
            Collections.reverse(list);
            if (!list.isEmpty() && list.get(0) == 0) {
                res.add(new ArrayList<>());
            } else {
                res.add(list);
            }
        }
        
        return res;
    }
}
