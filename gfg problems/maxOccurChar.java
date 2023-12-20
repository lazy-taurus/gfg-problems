import java.util.HashMap;

public class maxOccurChar {
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<line.length();i++){
            if(map.containsKey(line.charAt(i))){
                map.put(line.charAt(i),map.get(line.charAt(i))+1);
            }
            else{
                map.put(line.charAt(i),1);
            }
        }
        char maxChar = ' '; int max = 0;
        for(char c:map.keySet()){
            if(map.get(c)>max){
                max = map.get(c);
                maxChar = c;
            }
            else if(map.get(c)==max){
                if(c<maxChar){
                    maxChar = c;
                }
            }
        }
        return maxChar;
    }
    public static void main(String[] args) {
        
    }
}
