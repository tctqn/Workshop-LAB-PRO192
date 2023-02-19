package lab2;
import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private String address;
    private double salaryCoefficient;
    
    
    //Method Of Initlization
    
    Employee() {}
    Employee(String name,int age,String address,double salaryCoefficient) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salaryCoefficient = salaryCoefficient;
    }
    
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
         this.name = sc.nextLine();
        System.out.print("Enter age: ");
         this.age = sc.nextInt();
        System.out.print("Enter Address: ");
         sc.nextLine();
         this.address = sc.nextLine();
        System.out.print("Enter Salary Coefficient: ");
         this.salaryCoefficient = sc.nextFloat();
         System.out.println("");
    }

    
    public double calculateSalary() {
      return 1050000 * this.salaryCoefficient ;
    }
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("Salary: " + this.calculateSalary());
    }
    
    public String getName() {
        return this.name;
    }
    
}
