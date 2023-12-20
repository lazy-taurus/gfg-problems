import java.util.ArrayList;

public class betterString {

    public static void numberOfSubsequences(String s, StringBuilder curString, int index, ArrayList<StringBuilder> allStrings) {
        if(index == s.length()) {
            if(!allStrings.contains(curString)){
                allStrings.add(curString);
            }
            return;
        }
        curString.append(s.charAt(index));
        numberOfSubsequences(s, curString, index + 1, allStrings);
        curString.deleteCharAt(curString.length() - 1);
        numberOfSubsequences(s, curString, index + 1, allStrings);
        return;
        
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aaa";
        ArrayList<StringBuilder> allStrings1 = new ArrayList<StringBuilder>();
        ArrayList<StringBuilder> allStrings2 = new ArrayList<StringBuilder>();
        numberOfSubsequences(str1, new StringBuilder(), 0, allStrings1);
        numberOfSubsequences(str2, new StringBuilder(), 0, allStrings2);

        if(allStrings1.size() < allStrings2.size()) {
            return ;
        }
        else {
            return ;
        }
        

    }
}