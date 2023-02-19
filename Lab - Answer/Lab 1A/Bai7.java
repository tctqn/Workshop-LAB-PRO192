package lab1a;
import java.util.Scanner;
public class Bai7 {
       
    private static int CheckPerfectNum(int n) {
        int res = 0;
        for (int i = 1;i<n;i++) {
            if (n%i==0) {
                res+=i;
            }
        } 
        if (res == n) return 1;
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = ip.nextInt();
        if (n <= 1) {
            System.out.println("No Perfect Number in [" + n + ",1]");
        }
        int temp = 0;
        for (int i = 1; i<=n ;i++) {
            if(CheckPerfectNum(i)==1) {
                System.out.print(i + " ");
                ++temp;
            }
        }
        if (temp!=0) {
            System.out.println("\nCheck Successfully!!!");
        }
    }
}
