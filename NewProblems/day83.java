import java.util.Arrays;

public class day83 {
    static int minValue(String s, int k){
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        while (k-->0) {
            freq[25]--;
            Arrays.sort(freq);
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += freq[i]*freq[i];
        }
        return ans;
    }
}