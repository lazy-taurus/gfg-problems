import java.util.Vector;

public class isogram {

    public static boolean isIsogram(String data){
        //Your code here
        Vector<Character> st = new Vector<Character>(data.length() + 1);
        for(int i = 0; i < data.length(); i++){
            if(st.contains(data.charAt(i))){
                return false;
            }
            st.add(data.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
