package lab4;
import java.util.Scanner;

public class OfficialEmployee extends Employee {
	private double oTime;
	
	public OfficialEmployee() {}
	
	public OfficialEmployee(String id, String fName, int age, 
			String dateOfBirth, int wDays,double oTime) {
		super(id, fName, age, dateOfBirth,wDays);
		this.oTime = oTime;
	}

	public double getoTime() {
		return oTime;
	}

	public void setoTime(double oTime) {
		this.oTime = oTime;
	}
	

	public String calSalary() {
		return String.format("%.0f",wDays*1000000 + oTime * 100000);
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		try  {
			System.out.println("========FULL-TIME========");
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
			System.out.print("Enter OverTime: "); this.oTime = sc.nextDouble();
			System.out.print("Enter Works Day: "); this.wDays = sc.nextInt();
		} finally {
//			sc.close();
		}
	}
	
	public void output() {
		System.out.println("========FULL-TIME========");
		System.out.println("ID: " + this.id);	
		System.out.println("FullName: " + this.fName); 
		System.out.println("Age: " + this.age);
		System.out.println("Date Of Birth: " + this.dateOfBirth); 
		System.out.println("Works Day: " + this.wDays);
		System.out.println("OverTime: " + this.oTime);
		System.out.println("Salary: " + this.calSalary()); 
	}
	
	
	

	@Override
	public String toString() {
		return "Official  " + super.toString() + " Over Time: " +
				getoTime() + " hour(s)" + " Salary: " + calSalary() + "]";
	}
	
	
	
}
