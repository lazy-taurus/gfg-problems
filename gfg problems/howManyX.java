public class howManyX {
    int countX(int L, int R, int X) {
        // code here
        int count = 0;
        for(int i=L; i<=R; i++) {
            int temp = i;
            while(temp > 0) {
                if(temp%10 == X) {
                    count++;
                }
                temp /= 10;
            }
        }
        return count;
        
    }
}
