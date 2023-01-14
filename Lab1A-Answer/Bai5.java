package lab1a;

import static java.lang.Math.sqrt;

public class Bai5 {
    
    private static int CheckPrime(int a) {
        int res = 1;
        if (a<2) res = 0;
        else {
            for (int i=2;i<=sqrt(a);i++) {
                if (a%i==0) res = 0;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
       int a = Integer.parseInt(args[0]),
               b = Integer.parseInt(args[1]);
       if (a > b) {
            int temp = a;
            a = b ;
            b = temp;
        }
       if(b < 2) {
           System.out.println("No Prime Number in [" + a + "," +b + "]");
       } else {
           int temp = 0;
                for (int i = a;i <= b;i++) {
                    if(CheckPrime(i)!=0) {
                        System.out.print(i + " ");
                        temp++;
                    }
            }
                if (temp!=0) System.out.println("\nCheck Successfully!!!");
                else {
                    System.out.println("No Prime Number in [" + a + "," +b + "]");
                }
       }
       
    }
}
