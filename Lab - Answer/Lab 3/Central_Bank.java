package lab3;
import java.util.Scanner;
public class Central_Bank extends SoftBank {
	private int ctv;
	final int ctvSalary = 1000;
	final private double ctrl_coef = 1.5;
	
	
	public Central_Bank() {}
	
	public Central_Bank(String ID, String name, String datePublished, String address,
			int seWorkers, int juWorkers, int ctv) {
		super(ID, name, datePublished, address, seWorkers, juWorkers);
		this.ctv = ctv;
	}

	public int calEstiCost() {
		return (int)((super.seWorkers*seSalary + super.juWorkers*juSalary)*ctrl_coef);
	}


	public int calRealCost() {
		return this.calEstiCost() + this.ctv * this.ctvSalary;
	}
	
	public int calCtvSalary() {
		return this.ctv * ctvSalary;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========Central-Bank==========");
		System.out.print("Enter iD: ");
		this.ID = sc.nextLine();
		System.out.print("Enter Name: ");
		this.name = sc.nextLine();
		System.out.print("Enter Date Published: ");
		this.datePublished = sc.nextLine();
		while(!CheckDate.checkDate(datePublished)) {
			System.out.println("Invalid Date!!!\nTry again: ");
			System.out.print("Enter Date Published: ");
			this.datePublished = sc.nextLine();
		}
		System.out.print("Enter Address: ");
		this.address = sc.nextLine();
		System.out.print("Enter Senior Workers: ");
		this.seWorkers = sc.nextInt();
		System.out.print("Enter Junior Workers: ");
		this.juWorkers = sc.nextInt();
		System.out.print("Enter Number of CTV: ");
		this.ctv = sc.nextInt();
		sc.close();
	}
	
	public void output() {
		System.out.println("========Central-Bank==========");
		System.out.println("ID: " + this.ID);
		System.out.println("Name: " + this.name);
		System.out.println("Date Published: " + this.datePublished);
		System.out.println("Address: " + this.address);
		System.out.println("Senior Workers: " + this.seWorkers);
		System.out.println("Junior Workers: " + this.juWorkers);
		System.out.println("Number of CTV: " + this.ctv);
		System.out.println("CTV Salary: " + this.calCtvSalary());
		System.out.println("Estimated Cost: " + this.calEstiCost());
		System.out.println("Real Cost: " + this.calRealCost());
	}

	@Override
	public String toString() {
		return "Central" + super.toString() + ", CTV Numbers:  " + ctv + 
				", CTV Salary: " + this.calCtvSalary() + ", Estimated Cost: " + this.calEstiCost()
				+ ", Real Cost: " + this.calRealCost() + " ]";
	}
	
	
	
	
}
