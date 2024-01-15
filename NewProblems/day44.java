/**
 * day44
 */
public class day44 {

    public String removeKdigits(String S, int K) {
        // code here
        int count = 0;
        for (int index = 9; index >= 0 && count<K; index--) {
            while(S.indexOf(String.valueOf(index))!= -1 && count<K) {
                S = S.replaceFirst(String.valueOf(index), "");
                count++;
            }
        }
        int temp = Integer.parseInt(S);
        return String.valueOf(temp);
    }
}