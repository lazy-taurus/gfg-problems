/**
 * day102
 */
public class day102 {

    public char nthCharacter(String s, int r, int n)
    {
        if (r==0) {
            return s.charAt(n);
        }
        int num =1;
        for(int i=0; i<r; i++) num*=2;
        int or=n/num;
        int sub=n%num;
        if (s.charAt(or)=='1') {
            return nthCharacter("10", r-1, sub);
        } else{
            return nthCharacter("01", r-1, sub);
        }
    }
    String buildString(char c, int r){
        if (r<=0) {
            return ""+c;
        }
        if (c=='1') {
            return buildString('1', r-1)+buildString('0', r-1);
        }else {
            return buildString('0', r-1)+buildString('1', r-1);
        }
    }
}