package lab1a;
import java.util.Scanner;
public class Bai6 {
    
    private static int CheckSqrNum(int x) {
        if (x==1) return 1;
            for(int i=0 ;i<=x/2;i++) {
                if (i*i==x) {
                    return 1;
                }
            }
            return 0;
        }
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int m = ip.nextInt(), n = ip.nextInt();
        if (m > n) {
            int temp = m;
            m = n ;
            n = temp;
        }
        if (n < 1) System.out.println("No Square Number in [" + m + "," + n + "]");
        else {
            System.out.print("Square Number in [" + m + "," + n + "]: ");
            for(int i=m; i<= n;i++) {
                if(CheckSqrNum(i)==1) System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
