package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Menu {
	private String title;
	private ArrayList<String> options = new ArrayList<>();


	public Menu(String title, String[] options) {
		this.title = title;
		this.options.addAll(Arrays.asList(options));
	}

	public void displayMenu() {
		System.out.println(title);
		System.out.println("-------------------------");
		for (int i = 0; i < options.size(); i++) {
			System.out.println((i + 1) + "." + options.get(i));
		}
		System.out.println("-------------------------");
	}

	public int getChoice() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		try {
			System.out.print("Enter selection..");
			choice = Integer.parseInt(sc.nextLine());			
		} catch (Exception e) {
			System.out.println("Your selection must be a number in [1-" + options.size() + "]");
		}
		return choice;
	}

	public abstract void run() throws FileNotFoundException, IOException;

	public abstract void execute(int choice) throws FileNotFoundException, IOException;
}
