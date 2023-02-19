package lab2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<> ();
        Employee[] employees = new Employee[1];
        
        //Input information of Employee
        for(int i=0 ;i<employees.length;i++) {
            employees[i] = new Employee();
            System.out.println("Employee [" + (i + 1) + "]");
            employees[i].inputInfo();
        }

         // Calculate the total salary
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }
        System.out.println("\nTotal salary: " + totalSalary + "\n");
        
        for(int i=0;i<employees.length;i++) {
            list.add(employees[i]);
        }
        
        //Sort Name in Descending Order
        Collections.sort(list, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }
            
        });
               
        // Display information
        int indx = 0;
        for (Employee item:list) {
            ++indx;
            System.out.println("Employee [" + indx + "]");
            item.displayInfo();
            System.out.println("");
        }
        
    }
}
