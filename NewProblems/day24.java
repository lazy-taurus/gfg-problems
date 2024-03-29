    import java.io.*;
    import java.util.*;
    
    
    class IntArray
    {
        public static int[] input(BufferedReader br, int n) throws IOException
        {
            String[] s = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            
            return a;
        }
        
        public static void print(int[] a)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
        
        public static void print(ArrayList<Integer> a)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t;
            t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                
                int N; 
                N = Integer.parseInt(br.readLine());
                
                
                int[] S = IntArray.input(br, N);
                
                
                int[] F = IntArray.input(br, N);
                
                ArrayList<Integer> res = Solution.maxMeetings(N, S, F);
                
                IntArray.print(res);
                
            }
        }
    }
    
    
    class Solution {
        public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
            // code here
            ArrayList<Integer> res = new ArrayList<>();
            int[][] diff = new int[N][3];
            for(int i=0;i<N;i++){
                diff[i][0] = S[i];
                diff[i][1] = F[i];
                diff[i][2] = i+1;
            }
            
            Arrays.sort(diff, Comparator.comparingInt(a -> a[1]));

            int prevF = 0;
            for(int i=0;i<N;i++){
                if(prevF < diff[i][0]){
                    res.add(diff[i][2]);
                    prevF = diff[i][1];
                }
            }
            res.sort((a,b)->a-b);
            return res;

        }
    }
