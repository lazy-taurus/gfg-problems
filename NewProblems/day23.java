import java.util.*;
import java.io.*;
/**
 * day23
 */
public class day23 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int Ratings[] = new int[N];
            for (int i = 0; i < N; i++) {
                Ratings[i] = sc.nextInt();
            }
            int ans = Solution.minCandy(N, Ratings);
            System.out.println(ans);
        }
        sc.close();
    }
}
class Solution {
    static int minCandy(int N, int Ratings[]) {
        
        int candies[] = new int[N];
        
        // atleast 1 candy to each child
        
        Arrays.fill(candies, 1);
        
        
        // if child to the left has higher rating, give 1 more candy
        
        for(int i = 1; i < N; i++) {
            if(Ratings[i] > Ratings[i-1]) {
                candies[i] = candies[i-1] + 1;
            }
        }


        // if child to the right has higher rating, give 1 more candy if it is more than the current value

        for(int i = N-2; i >= 0; i--) {
            if(Ratings[i] > Ratings[i+1]) {
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }

        // sum up all the candies
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += candies[i];
        }
        return sum;
    }
}