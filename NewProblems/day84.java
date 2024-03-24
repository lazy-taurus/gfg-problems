import java.util.ArrayList;
import java.util.HashSet;

public class day84 {
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        int right = 0;
        int left = 0;
        HashSet<String> set = new HashSet<>();
        for (String word : dictionary) {
            set.add(word);
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;

        for (right = 1; right <= s.length(); right++) {
            for (left = 0; left < right; left++) {
                if (dp[left] == 1 && set.contains(s.substring(left, right))) {
                    dp[right] = 1;
                    break;
                }
            }
        }
        return dp[s.length()];
        // String combined = "";
        
        // HashSet<Integer> start = new HashSet<>();
        // HashSet<Integer> end = new HashSet<>();
        // int currStart = 0;
        // int currEnd = -1;

        // for(int i = 0; i < n; i++){
        //     combined += dictionary.get(i);
        //     start.add(currStart);
        //     currEnd = combined.length() - 1;
        //     end.add(currEnd);
        //     currStart = currEnd + 1;
        // }
        // if (!combined.contains(s)) {
        //     return 0;
        // } else {
        //     int startIdx = combined.indexOf(s);
        //     int endIdx = startIdx + s.length();
        //     if (start.contains(startIdx) && end.contains(endIdx)) {
        //         return 1;
        //     } else {
        //         return 0;
        //     }            
        // }
    }
}
