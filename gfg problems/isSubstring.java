public class isSubstring {
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s1.length()!=s2.length()){
            return false;
        }
        String temp= s1+s1;
        // for(int i=0; i<s1.length(); i++){
        //     if(temp.substring(i,i+s1.length()).equals(s2)){
        //         return true;
        //     }
        //     System.out.println(temp.substring(i,i+s1.length()));
        // }
        if(temp.contains(s2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="ABCD";
        String s2="CDAB";
        System.out.println(areRotations(s1,s2));
    }
}
