package lab3;

public abstract class SoftBank {
	protected String ID;
	protected String name;
	protected String datePublished;
	protected String address;
	protected int seWorkers,juWorkers;
	
	final static int seSalary = 5000;
	final static int juSalary = 2000;
	
	
	public SoftBank() {}	
	public SoftBank(String ID, String name, String datePublished,
			String address, int seWorkers, int juWorkers) {
		while(!CheckDate.checkDate(datePublished)) {
			System.out.println("Invalid Date!!!\nTry again: ");
		}
		this.ID = ID;
		this.name = name;
		this.datePublished = datePublished;
		this.address = address;
		this.seWorkers = seWorkers;
		this.juWorkers = juWorkers;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSeWorkers() {
		return seWorkers;
	}

	public void setSeWorkers(int seWorkers) {
		this.seWorkers = seWorkers;
	}

	public int getJuWorkers() {
		return juWorkers;
	}

	public void setJuWorkers(int juWorkers) {
		this.juWorkers = juWorkers;
	}

	public static int getSesalary() {
		return seSalary;
	}

	public static int getJusalary() {
		return juSalary;
	}

	public abstract int calEstiCost();

	public abstract void input();
	
	public abstract void output();
	
	
	@Override
	public String toString() {
		return "SoftBank [ID: " + ID + ", Name: " + name + ", Date Published: " + datePublished + ", Address: " + address
				+ ", Senior Workers: " + seWorkers + ", Junior Workers: " + juWorkers;
	}
	
	
	
	
}
