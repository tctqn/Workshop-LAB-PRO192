package lab1a;

public class Bai12 {
    
    private static int[] CheckDivisor(int n) {
        int[] a = new int[85];
        int j = 0;
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                a[j++]+=i;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 1) {
            System.out.println("Invalid!");
        } else {
            int[] arr = CheckDivisor(n);
            for(int i:arr) {
                if (i>0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
        }
    }
}
