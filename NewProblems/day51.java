import java.util.Arrays;

public class day51 {
    int min_sprinklers(int gallery[], int n)
    {
        // code here
        int[] plant = new int[n];
        Arrays.fill(plant, -1);
        for(int i = 0;i<n;i++){
            if(gallery[i] != -1){
                int a = Math.max(0,i-gallery[i]);
                int b = Math.min(n-1,i+gallery[i]);
                for(int j = a;j<=b;j++){
                    plant[j] = Math.max(plant[j],b);
                }
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(plant[i] == -1){
                return -1;
            }
            if(i<=plant[i]){
                ans++;
                i = plant[i];
            }
        }
        return ans;
    }
}
