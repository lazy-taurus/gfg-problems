import java.util.ArrayList;
import java.util.List;

public class reverse {
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> b = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            b.add(a.get(i));
        }
        return b;
        
    }
}
