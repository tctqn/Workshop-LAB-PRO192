package lab4;
import java.util.Scanner;
public class pTimeEmployee extends Employee {
	final static double disRate = 0.5;
	
	public pTimeEmployee() {}
	
	public pTimeEmployee(String id, String fName, int age, 
			String dateOfBirth, int wDays) {
		super(id, fName, age, dateOfBirth, wDays);
	}
	
	/* I decided to return String value because I didn't like
	 the "E" scientific notation in my result */
	public String calSalary() {
		return String.format("%.0f",this.wDays * 1000000 * disRate) ;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("========PART-TIME========");
			System.out.print("Enter ID: ");	this.id = sc.nextLine();
			System.out.print("Enter FullName: "); this.fName = sc.nextLine();
			System.out.print("Enter Age: "); this.age = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Date Of Birth: "); this.dateOfBirth = sc.nextLine();
			while(!CheckDate.checkDate(this.dateOfBirth)) {
				System.out.println("Invalid Date!!!\nTry again: ");
				System.out.print("Enter Date Of Birth: ");
				this.dateOfBirth = sc.nextLine();
			}
			System.out.print("Enter Works Day: "); this.wDays = sc.nextInt();
		} finally {
			sc.close();
		}
	}
	
	public void output() {
		System.out.println("========PART-TIME========");
		System.out.println("ID: " + this.id);	
		System.out.println("FullName: " + this.fName); 
		System.out.println("Age: " + this.age);
		System.out.println("Date Of Birth: " + this.dateOfBirth); 
		System.out.println("Works Day: " + this.wDays); 
		System.out.println("Salary: " + this.calSalary()); 
	}

	@Override
	public String toString() {
		return "Part-time " + super.toString() +" Salary: " + calSalary() + "]";
	}
	
	


	
	
}
