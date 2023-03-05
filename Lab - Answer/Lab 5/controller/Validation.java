package controller;

import java.util.ArrayList;

import model.Student;

public class Validation {
	public static boolean isValidName(String name) {
		if(!name.matches("^[a-zA-Z ]+$")) {
			return false;
		}
		return true;
	}
	public static boolean isValidID(ArrayList<Student> students,String id) {
		String s1 = id.substring(0,2);
		String s2 = id.substring(2);
		if (!(s1.matches("^[A-Za-z]{2}$")&&s2.matches("^[0-9]{6}$"))) return false;
		else {
			for(Student student:students) {
				if(student.getID().equals(id.toUpperCase())) {
					System.out.println("This ID already existed");
					System.out.println(student);
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isValidAverage(double average) {
		if(average > 10 || average < 0) {
			System.out.println("Average score must be a number from [0-10]");
			return false;
		}
		return true;
	}
}
