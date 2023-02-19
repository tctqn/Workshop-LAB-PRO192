package lab1a;

import java.util.Scanner;
public class Bai4 {
    
        private static long Sum(long n) {
        return n*(n+1)/2;
        }
    
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        long res = Sum(x);
        System.out.println("Sum = " + res);
    }
}
