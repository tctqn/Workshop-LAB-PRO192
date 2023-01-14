package lab1a;
import static java.lang.Math.log;
import static java.lang.Math.pow;
public class BaI9 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]),
                e = Integer.parseInt(args[1]);
        int n;
            if (a<1 && a>0) {
                n = (int)(log(e)/log(a)) - 1;
                System.out.println("Result: " + (float)(1/1-n));
                        
            } else if (a > 1) {
                int res = 0;
                n = (int)(log(e)/log(a)) + 1;
                for(int i=0;i<=n;i++) {
                    res+=pow(a,i);
                }
                System.out.println("Result: " + res);
            }   
    }
 
}
