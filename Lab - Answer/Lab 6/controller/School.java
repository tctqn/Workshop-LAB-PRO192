package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

	public void addStudent(Student student) {
		this.inputStudent(student);
		students.add(student);
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
		while (!Validation.isValidName(name)) {
			System.out.println(name + "while");
			System.out.println("Invalid Name");
			System.out.println("<=====Input-Again=====>");
			System.out.print("Enter Name: ");
			name = sc.nextLine();
		}
		final String namef = name;
		ArrayList<Student> searchedList = new ArrayList<>();
		students.forEach((student) -> {
			String[] s = student.getName().split("\\s+");
			if (s.length == 1) {
				if (s[0].toLowerCase().compareTo(namef.toLowerCase()) == 0)
					searchedList.add(student);
			} else {
				String c = student.getName().substring(student.getName().lastIndexOf(" ")).toLowerCase().trim();
				if (c.compareTo(namef.toLowerCase()) == 0)
					searchedList.add(student);
			}
		});
		return searchedList;
	}

	public ArrayList<Student> searchByID() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
		String id = sc.nextLine();
		while (!id.matches("^[A-Za-z0-9]$")) {
			System.out.println("Invalid ID");
			System.out.println("<=====Input-Again=====>");
			System.out.print("Enter ID: ");
			id = sc.nextLine();
		}
		final String subID = id;
		ArrayList<Student> searchedList = new ArrayList<>();
		students.forEach((student) -> {
			if (student.getID().compareTo(subID.toUpperCase()) == 0)
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
				String[] c1 = o1.getName().split("\\s+");
				String[] c2 = o2.getName().split("\\s+");
				if (c1.length != 1 && c2.length != 1) {
					String s1 = o1.getName().substring(o1.getName().lastIndexOf(" ")).toLowerCase();
					String s2 = o2.getName().substring(o2.getName().lastIndexOf(" ")).toLowerCase();
					return s1.compareTo(s2);
				} else if (c1.length != 1 && c2.length == 1) {
					String s1 = o1.getName().substring(o1.getName().lastIndexOf(" ")).toLowerCase();
					return s1.compareTo(c2[0]);
				} else if (c1.length != 1 && c2.length == 1) {
					String s2 = o2.getName().substring(o1.getName().lastIndexOf(" ")).toLowerCase();
					return s2.compareTo(c1[0]);
				} else {
					return c1[0].toLowerCase().compareTo(c2[0].toLowerCase());
				}
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

	// Implement Read and Write File Method

	public void readStudentFromFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] item = line.split(";");
			String id = item[0];
			String name = item[1];
			Double aver = Double.parseDouble(item[2]);
			Student newStd = new Student(id,name,aver);
			students.add(newStd);			
		}
	}
	
	public void writeToFileAppend() throws FileNotFoundException, IOException {
		for(Student student:students) {
			String outputText = student.getID() + ";" +student.getName() + "; " + student.getAverage();
			saveToFile("output.txt",outputText,true);
		}
	}
	public void writeToFileOver() throws FileNotFoundException, IOException {
		saveToFile("output.txt","<=====List-Students=====>",false);
		for(Student student:students) {
			String outputText = student.getID() + ";" +student.getName() + "; " + student.getAverage();
			saveToFile("output.txt",outputText,true);
		}
	}
	public static void saveToFile(String filename,String text,boolean append) throws IOException{
		File file = new File(filename);
		
		FileWriter fw = new FileWriter(file,append);
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(text);
		pw.close();
	}
	

}
