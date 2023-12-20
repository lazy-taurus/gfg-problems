import java.util.Vector;

public class numPattern {
    static String printMinNumberForPattern(String S){

        StringBuilder str = new StringBuilder();
        Vector<Integer> st = new Vector<Integer>(S.length() + 1);
        for(int i=0; i<=S.length() ;i++){
            st.add(i+1);
            if(S.length()==i || S.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    str.append(st.get(0).toString());
                    st.remove(0);
                }
            }
        }
        return (str.toString());
    }
    public static void main(String[] args) {
        String k =printMinNumberForPattern("IIDDD");
        System.out.println(k);
                
    }
}
