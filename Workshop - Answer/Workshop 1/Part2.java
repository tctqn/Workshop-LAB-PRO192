package workshop1;
import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        float num1,num2;
        String     op;
        Scanner inp = new Scanner(System.in);
        System.out.print("Input the number 1: ");
        num1 = inp.nextFloat();
        System.out.print("Input the number 2: ");
        num2 = inp.nextFloat();
        System.out.print("Input the operators(+-*/): ");
        inp = new Scanner(System.in);
        op = inp.nextLine();
        switch(op) {
            case "+":
                System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1+num2));
                break;
            case "-":
                System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1-num2));
                break;
            case "*":
                System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1*num2));
                break;
            case "/":
                if(num2==0) {
                    System.out.println("Divided by 0 is undefined!!!");
                } else {
                    System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1/num2));
                }
                break; 
        }
    }
}
