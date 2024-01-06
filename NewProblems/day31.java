import java.util.HashMap;
import java.util.Map;

public class day31 {
    int kSubstrConcat(int n, String s, int k)
    {
        // Your Code Here   
        if(n%k!=0) return 0;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i+=k){
            String str = s.substring(i,i+k);
            map.put(str,map.getOrDefault(str,0)+1);
        }
        if(map.size()>2) return 0;
        if(map.size()==1) return 1;
        int count = 0;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>1) count++;
        }
        if(count<=1) return 1;
        return 0;
    }
}