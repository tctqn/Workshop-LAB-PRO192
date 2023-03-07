package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import controller.School;
import model.Student;

public class SchoolManagement extends Menu {
	private School school = new School();
	private ArrayList<Student> students = new ArrayList<>();

	static String[] options = { "Display all students", "Search student", "Add new student", "Sorting display",
			"Print into textfile", "Exit" };

	public SchoolManagement() {
		super("School Management System", options);
	}

	@Override
	public void execute(int choice) throws FileNotFoundException, IOException {
		SchoolManagement smgm = new SchoolManagement();
		switch (choice) {
		case 1:
			students = school.getListStudent();
			if (students.isEmpty()) {
				System.out.println("There is no student to show!");
				System.out.println("You need add student first!");
			} else
				school.displayStudent(students);
			break;
		case 2:
			if (students.isEmpty()) {
				System.out.println("There is no student to show!");
			} else
				menuSearch();
			smgm.run();
			break;
		case 3:
			school.addStudent(new Student());
			students = school.getListStudent();
			break;
		case 4:
			if (students.isEmpty()) {
				System.out.println("There is no student to show!");
			} else
				menuSort();
			smgm.run();
			break;
		case 5:
			menuPrintFile();
			smgm.run();
			break;
		default:
			break;
		}

	}

	public void menuSearch() throws IOException {
		Scanner sc = new Scanner(System.in);
		options = new String[] { "Find by Name", "Find by ID", "Back to main menu" };
		Menu s = new Menu("Student Searching", options) {

			@Override
			public void execute(int choice) {
				switch (choice) {
				case 1:
					ArrayList<Student> subStds = new ArrayList<>();
					subStds.addAll(school.searchByName());
					if (subStds.isEmpty()) {
						System.out.println("NOT FOUND!");
					} else
						school.displayStudent(subStds);
					break;
				case 2:
					subStds = new ArrayList<>();
					subStds.addAll(school.searchByID());
					if (subStds.isEmpty()) {
						System.out.println("NOT FOUND!");
					} else
						school.displayStudent(subStds);
					break;
				default:
					break;
				}
			}

			@Override
			public void run() {
				Scanner sc = new Scanner(System.in);
				while (true) {
					this.displayMenu();
					int choice = getChoice();
					if (choice == 3)
						break;
					if (choice < 0 || choice > options.length) {
						System.out.println("Your selection must be a number in [1-" + options.length + "]");
						continue;
					}
					execute(choice);
				}

			}
		};
		s.run();
	}

	public void menuSort() throws IOException {
		options = new String[] { "Sort by StudentID", "Sort by Name", "Sort by Average point in descending",
				"Back to main menu" };

		Menu s = new Menu("Student Sorting", options) {

			@Override
			public void run() {
				Scanner sc = new Scanner(System.in);
				while (true) {
					this.displayMenu();
					int choice = getChoice();
					if (choice == 4)
						break;
					if (choice < 0 || choice > options.length) {
						System.out.println("Your selection must be a number in [1-" + options.length + "]");
						continue;
					}
					execute(choice);
				}

			}

			@Override
			public void execute(int choice) {
				switch (choice) {
				case 1:
					school.displayStudent(school.sortByID());
					break;
				case 2:
					school.displayStudent(school.sortByName());
					break;
				case 3:
					school.displayStudent(school.sortByAverage());
					break;
				default:
					break;
				}

			}
		};
		s.run();
	}

	public void menuPrintFile() throws IOException {
		options = new String[] { "Write Append File", "Overwrite File", "Back to main menu" };

		Menu s = new Menu("File Writing", options) {

			@Override
			public void run() throws FileNotFoundException, IOException {
				Scanner sc = new Scanner(System.in);
				while (true) {
					this.displayMenu();
					int choice = getChoice();
					if (choice == 3)
						break;
					if (choice < 0 || choice > options.length) {
						System.out.println("Your selection must be a number in [1-" + options.length + "]");
						continue;
					}
					execute(choice);
				}

			}

			@Override
			public void execute(int choice) throws FileNotFoundException, IOException {
				switch (choice) {
				case 1:
					school.writeToFileAppend();
					System.out.println("Write to file Successfully!!!");
					break;
				case 2:
					school.writeToFileOver();
					System.out.println("Write to file Successfully!!!");
					break;
				default:
					break;
				}

			}
		};
		s.run();
	}

	@Override
	public void run() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		try {
			school.readStudentFromFile("sch.txt");
			students = school.getListStudent();

		} catch (Exception e) {
			System.out.println("\nFile NOT FOUND!\n");
		}
		while (true) {
			options = new String[] { "Display all students", "Search student", "Add new student", "Sorting display",
					"Print into textfile", "Exit" };
			this.displayMenu();
			int choice = getChoice();
			if (choice == 6) {
				System.out.print("Do you want exit [y/n]: ");
				String confirm = sc.next().toLowerCase();
				if (confirm.equalsIgnoreCase("y")) {
					System.out.println("Thank you for using!!!");
					break;
				}
				continue;
			}
			if (choice < 0 || choice > options.length) {
				System.out.println("Your selection must be a number in [1-" + options.length + "]");
				continue;
			}
			execute(choice);
		}
	}

}
