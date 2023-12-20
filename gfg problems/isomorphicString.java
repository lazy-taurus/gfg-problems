import java.util.HashMap;

public class isomorphicString {
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length()!=str2.length()){
            return false;
        }

        HashMap<String, String> values = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            if(!values.containsKey(""+str1.charAt(i))){
                values.put(""+str1.charAt(i), ""+str2.charAt(i));
            }
            else{
                if(!values.get(""+str1.charAt(i)).equals(""+str2.charAt(i))){
                    
                    return false;
                }
                
            }
        
        }
        
        for(int i=0; i<str2.length(); i++){
            values.remove(""+str1.charAt(i));
            if(values.containsValue(""+str2.charAt(i))){
                return false;
            }
                  
        }

        return true;


    }
    public static void main(String[] args) {
        boolean res = areIsomorphic("pijthbsfy","fvladzpbf");
        System.out.println(res);
        
    }
}
