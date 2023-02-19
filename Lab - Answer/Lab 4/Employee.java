package lab4;

public abstract class Employee {
	protected String id;
	protected String fName;
	protected int age;
	protected String dateOfBirth;
	protected int wDays;
	
	public boolean dataIsSet;
	
	
	public Employee() {
		dataIsSet = false;
	};
	public Employee(String id, String fName, int age,
			String dateOfBirth, int wDays) {
		while(!CheckDate.checkDate(dateOfBirth)) {
			System.out.println("Invalid Date in Constructor!!!\nTry again");
		}
		this.id = id;
		this.fName = fName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.wDays = wDays;
		dataIsSet = true;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getwDays() {
		return wDays;
	}
	public void setwDays(int wDays) {
		this.wDays = wDays;
	}
	
	/* I decided to return String value because I didn't like
	 the "E" scientific notation in my result */
	public abstract String calSalary();
	
	public abstract void input();
	
	public abstract void output();
	
	@Override
	public String toString() {
		return "Employee [ID: " + id + ", Full Name: " + fName +
				", Age: " + age + ", DateOfBirth: " + dateOfBirth +
				", Work Days in Month: "+ wDays;
	}
	
	
	
	
	
}
