package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.School;
import model.Student;

public class SchoolManagement extends Menu {
	School school = new School();
	ArrayList<Student> students = new ArrayList<>();
	static String[] options = { "Display all students", "Search student", "Add new student", "Sorting display",
			"Exit" };

	public SchoolManagement() {
		super("School Management System", options);
	}

	@Override
	public void execute(int choice) {
		switch (choice) {
		case 1:
			if (school.getListStudent().isEmpty()) {
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
			break;
		case 3:
			students.add(school.addStudent(new Student()));
			break;
		case 4:
			if (students.isEmpty()) {
				System.out.println("There is no student to show!");
			} else
			menuSort();
			break;
		default:
			break;
		}

	}

	public void menuSearch() {
		Scanner sc = new Scanner(System.in);
		options = new String[] { "Find by Name", "Find by ID", "Back to main menu" };
		Menu s = new Menu("Student Searching", options) {

			@Override
			public void execute(int choice) {
				switch (choice) {
				case 1:
					school.displayStudent(school.searchByName());
					break;
				case 2:
					school.displayStudent(school.searchByID());
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

	public void menuSort() {
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

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			this.displayMenu();
			int choice = getChoice();
			if (choice == 5) {
				System.out.print("Do you want exit [y/n]: ");
				String confirm = sc.next().toLowerCase();
				if (confirm.equalsIgnoreCase("y"))
					break;
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
