package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import model.Student;
import view.SchoolManagement;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArrayList<Student> students = new ArrayList<>();
		School school = new School();
		SchoolManagement smgm = new SchoolManagement();
		smgm.run();
	}
	
}
