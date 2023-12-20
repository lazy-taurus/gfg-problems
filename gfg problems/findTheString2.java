import java.util.*;
public class findTheString2 {
    public static String makeSuperSequence( String[] input){
        if (input == null || input.length == 0) {
            return "";
        }

        int n = input.length;

        StringBuilder result = new StringBuilder(input[0]);
        for (int i = 1; i < n; i++) {
            
            if(!result.toString().contains(input[i])){
                for (int j = 0; j < input[i].length(); j++) {
                    if (result.toString().substring(result.length()-1-j,result.length()-1) == input[i].substring(0, j)) {
                        result = result.append(input[i].substring(j));
                        break;
                    }
                }
                // result = result.append(input[i]);
            }
        }

        return result.toString();
    }
    
    public static ArrayList<String> findMinimumString(int n, int k){
        int tot = 1;
        for(int i = 0; i < n; i++){
            tot *= k;
        }
        
        ArrayList<String> arr = new ArrayList<String>();
        HashSet<String> st = new HashSet<String>();

        for(int i = 0; i < tot; i++){
            String temp = Integer.toString(i, k);
            while (temp.length() < n && temp.length()>=n-1) {
                temp = "0" + temp;
            }
            
            if(!st.contains(temp)){
                st.add(temp);
                
                arr.add(temp);
            }
            if(st.size() == tot){
                break;
            }
        }
        return (arr);
    }
    public static void main(String[] args) {
        int N = 2;
        int K = 2;

        ArrayList<String> arr = findMinimumString(N, K);
        String res = makeSuperSequence(arr.toArray(new String[arr.size()]));
        System.out.println(res);
    }
}
