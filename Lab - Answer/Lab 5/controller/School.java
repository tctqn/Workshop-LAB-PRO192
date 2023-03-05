package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import model.Student;

public class School {
	private ArrayList<Student> students;

	public School() {
		students = new ArrayList<>();
	}

	// Implement display method
	public void displayStudent(ArrayList<Student> students) {
		System.out.println("List of students");
		System.out.println("------------------------------");
		students.forEach(student -> System.out.println(student));
		System.out.println("------------------------------");
		System.out.println("Total: " + students.size());
	}

	// Implement add student method
	public void inputStudent(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		while (!Validation.isValidName(name)) {
			System.out.println("Invalid Name");
			System.out.println("<=====Input-Again=====>");
			System.out.print("Enter Name: ");
			name = sc.nextLine();
		}
		student.setName(Normalization.nameNormalize(name));
		;
		System.out.print("Enter ID: ");
		String id = sc.nextLine();
		while (!Validation.isValidID(students, id)) {
			System.out.println("Invalid ID");
			System.out.println("<=====Input-Again=====>");
			System.out.print("Enter ID: ");
			id = sc.nextLine();
		}
		student.setID(Normalization.idNormalize(id));
		boolean check;
		do {
			try {
				check = false;
				System.out.print("Enter Average: ");
				double aver = Double.parseDouble(sc.nextLine());
				while (!Validation.isValidAverage(aver)) {
					System.out.println("Invalid Average");
					System.out.println("<=====Input-Again=====>");
					System.out.print("Enter Average: ");
					aver = Double.parseDouble(sc.nextLine());
				}
				student.setAverage(aver);
			} catch (Exception e) {
				System.out.println("Average score must be a number from [0-10]");
				check = true;
			}

		} while (check);

	}

	public Student addStudent(Student student) {
		this.inputStudent(student);
		students.add(student);
		return student;
	}

	// Implement get list of student
	public ArrayList<Student> getListStudent() {
		return students;
	}

	// Implement search method
	public ArrayList<Student> searchByName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		ArrayList<Student> searchedList = new ArrayList<>();
		students.forEach((student) -> {
			String s = student.getName().substring(student.getName().lastIndexOf(" ")).toLowerCase().trim();
			if (s.compareTo(name.toLowerCase()) == 0)
				searchedList.add(student);
		});
		return searchedList;
	}

	public ArrayList<Student> searchByID() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
		String id = sc.nextLine();
		ArrayList<Student> searchedList = new ArrayList<>();
		students.forEach((student) -> {
			if (student.getID().compareTo(id.toUpperCase()) == 0)
				searchedList.add(student);
		});
		return searchedList;
	}

	// Implement sort method
	public ArrayList<Student> sortByName() {
		ArrayList<Student> sortedList = new ArrayList<>();
		sortedList.addAll(students);
		sortedList.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String s1 = o1.getName().substring(o1.getName().lastIndexOf(" "));
				String s2 = o2.getName().substring(o2.getName().lastIndexOf(" "));
				return s1.compareTo(s2);
			}
		});
		return sortedList;
	}

	public ArrayList<Student> sortByID() {
		ArrayList<Student> sortedList = new ArrayList<>();
		sortedList.addAll(students);
		sortedList.sort((o1, o2) -> o1.getID().compareTo(o2.getID()));
		return sortedList;
	}

	public ArrayList<Student> sortByAverage() {
		ArrayList<Student> sortedList = new ArrayList<>();
		sortedList.addAll(students);
		sortedList.sort((o1, o2) -> Double.compare(o2.getAverage(), o1.getAverage()));
		return sortedList;
	}

}
