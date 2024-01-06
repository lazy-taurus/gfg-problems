import java.util.HashMap;
import java.util.Map;

public class day32 {
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max = Integer.MIN_VALUE;
        String winner = "";
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                winner = entry.getKey();
            }
            else if(entry.getValue()==max){
                if(winner.compareTo(entry.getKey())>0){
                    winner = entry.getKey();
                }
            }
        }
        return new String[]{winner,max+""};

    }
}
