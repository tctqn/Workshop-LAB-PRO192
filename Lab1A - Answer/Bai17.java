package lab1a;

import static java.lang.Math.pow;

public class Bai17 {
    
    private static int BinToDec(int n) {
        int res = 0, i = 0;
        while (n!=0) {
            if (n%10!=0 && n%10!=1) return -1;
            res+= ((n%10) * pow(2,i++));
            n/=10;
        }
        return res;
    }
   
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int res = BinToDec(n);
        if (res==-1) System.out.println("INVALID!!!");
        else {
            System.out.print("Decimal number: ");
            System.out.println(res);
        }
    }
  
}
