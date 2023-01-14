package lab1a;
import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = ip.nextInt();
        int res1 = 0, res2 = 1;
        System.out.print(res1 + " ");
        int res = res1 + res2;
        while(res<n) {
            res = res1 + res2;
            res1 = res2;
            res2 = res;
            System.out.print(res1 + " ");
        }
    }
}
