package model;


public class Student {
	private String ID;
	private String Name;
	private Double average; //Because i know Double has exactly one property and it is value
	
	public Student() {}

	public Student(String iD, String name, Double average) {
		ID = iD;
		Name = name;
		this.average = average;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", Average=" + average + "]";
	}
	
	
	
	
	
	
}	
