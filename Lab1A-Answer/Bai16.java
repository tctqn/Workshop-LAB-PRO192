package lab1a;

public class Bai16 {
    
    private static int[] DecToBin(int n) {
        int[] arr = new int[8];
        int j = 7;
        while (n!=0) {
            arr[j--] = n%2;
            n/=2;
        }
        return arr;
    }
   
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n > 255 || n < 0) {
            System.out.println("Out of range for unsigned binary!!!");
        } else {
            int[] res = DecToBin(n);
            int temp = 0;
            for (int i:res) {
                System.out.print(i); 
                if (++temp == 4) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}
