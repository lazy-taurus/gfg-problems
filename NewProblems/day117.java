import java.util.Stack;

/**
 * day117
 */
public class day117 {

    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> temp=new Stack<>();
        while (!st.empty()) {
            temp.push(st.pop());
        }
        st.push(x);
        while (!temp.empty()) {
            st.push(temp.pop());
        }
        return st;
    }
}