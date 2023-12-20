

public class betterString2 {
    public static int countSubString(String s) {
        int dp[] = new int[s.length()+1];
        int last[] = new int[26];
        for(int i = 0; i < 26; i++) {
            last[i] = -1;
        }
        dp[0] = 1;
        for(int i = 1; i < s.length()+1; i++) {
            dp[i] = 2 * dp[i - 1];
            if(last[s.charAt(i-1) - 'a'] != -1) {
                dp[i] = dp[i] - dp[last[s.charAt(i-1) - 'a']];
            }
            last[s.charAt(i-1) - 'a'] = i - 1;
        }
        return dp[s.length()];

    }
    public static String betterString(String str1, String str2) {
        // Code here
        int num1 = countSubString(str1);
        int num2 = countSubString(str2);
        if(num1 < num2) {
            return str2;
        }
        else {
            return str1;
        }
    }
    public static void main(String[] args) {
        
    }
}
