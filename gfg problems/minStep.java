public class minStep {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(minSteps(n));
    }
    public static int minSteps(int n) {
        if (n == 1) {
            return 0;
        }
        int op1 = Integer.MAX_VALUE;
        // int op2 = Integer.MAX_VALUE;
        if (n % 3 == 0) {
            op1=minSteps(n / 3);
            
        }
        else{
            op1=minSteps(n - 1);
        }
        op1++;
        return op1;
        
    }
}