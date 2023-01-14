package lab1a;

import static java.lang.Math.*;

public class Bai3 {
    public static void main(String[] args) {
        double a = Float.parseFloat(args[0]),
                b = Float.parseFloat(args[1]),
                    c = Float.parseFloat(args[2]);
        double delta = b*b - 4*a*c;
        if (delta > 0) {
            double x1 = (-b+sqrt(delta))/2*a,
                    x2 = (-b-sqrt(delta))/2*a;
            System.out.println("Your equation has two different solutions: ");
            System.out.print("x1 = "+ x1 + "\n" + "x2 = " + x2 + "\n");
        } else if (delta == 0) {
            System.out.println("Your equation double soluton x1 = x2 = " + (-b/2*a));
        } else {
            System.out.println("Your equation has NO solution");
        }
    }
}
