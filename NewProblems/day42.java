import java.util.ArrayList;

public class day42 {
    ArrayList<Integer> search(String pat, String txt)
    {
        // your code here
        ArrayList<Integer> arr = new ArrayList<>();
        int last = 0;
        while (pat.indexOf(txt, last) != -1) {
            last = pat.indexOf(txt, last)+1;
            arr.add(last);
        }
        return arr;
    }
}
