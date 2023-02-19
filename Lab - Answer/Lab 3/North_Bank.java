package lab3;

import java.util.Scanner;

public class North_Bank extends SoftBank {
	
	final private double north_coef = 2;
	
	public North_Bank() {}
	
	public North_Bank(String ID, String name, String datePublished, String address, int seWorkers, int juWorkers) {
		super(ID, name, datePublished, address, seWorkers, juWorkers);
	}

	public int calEstiCost() {
		return (int)((super.seWorkers*seSalary + super.juWorkers*juSalary)*north_coef);
	}
	
	public int calRealCost() {
		return this.calEstiCost();
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========North-Bank==========");
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
		sc.close();
	}
	
	public void output() {
		System.out.println("========North-Bank==========");
		System.out.println("ID: " + this.ID);
		System.out.println("Name: " + this.name);
		System.out.println("Date Published: " + this.datePublished);
		System.out.println("Address: " + this.address);
		System.out.println("Senior Workers: " + this.seWorkers);
		System.out.println("Junior Workers: " + this.juWorkers);
		System.out.println("Estimated Cost: " + this.calEstiCost());
		System.out.println("Real Cost: " + this.calRealCost());
	}
	
	@Override
	public String toString() {
		return "North" + super.toString() + ", Estimated Cost: " + this.calRealCost()
			+ ", Real Cost: " + this.calRealCost() + " ]";
	}
	
	
	
}
