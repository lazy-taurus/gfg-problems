public class day92 {
    int DivisibleByEight(String s){
        if(s.length()>3) s=s.substring(s.length()-3); 
        int num = Integer.parseInt(s);
        if (num%8==0) return 1;
        else return -1; 
    }
}
