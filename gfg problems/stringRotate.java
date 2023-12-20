public class stringRotate {
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length() != str2.length()){
            return false;
        }
        if (str1.length() ==2){
            return(str1 == str2);
        }
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt((i+2)%str1.length()) != str2.charAt(i) && str1.charAt((str1.length()+i-2)%str1.length()) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}