package lab1a;


public class Bai2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);
        if (a==0) {
            if (b==0) {
                System.out.println("The Equation has infinitely solutions");
            }
            throw new RuntimeException("Divided by 0 is not found");
        } else {
                  System.out.println("The equation has one solution: x = " + (float)-b/a);
        }
    }
}
