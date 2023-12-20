import java.util.ArrayList;
import java.util.List;

public class printPattern {
    public static void main(String[] args) {
        
    }

    public List<Integer> pattern(int N){
        List<Integer> pattern = new ArrayList<>();

        int indicator = N;
        pattern.add(indicator);
        while (indicator > 0 ) {
            indicator-=5;
            pattern.add(indicator);
        }
        while (indicator < N) {
            indicator+=5;
            pattern.add(indicator);
            
        }
        return pattern;
    }
}
