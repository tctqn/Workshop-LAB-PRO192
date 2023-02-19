package lab4;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		OfficialEmployee emp1 = new OfficialEmployee("DE170768",
				"Truong Cong Trinh_1", 20, "08/05/2003", 19,11);
		
		pTimeEmployee emp2 = new pTimeEmployee("DE170768",
				"Truong Cong Trinh_2", 20, "08/05/2003",19);
		
		OfficialEmployee emp3 = new OfficialEmployee();
		pTimeEmployee emp4 = new pTimeEmployee();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		for(Employee item:list) {
			if(!item.dataIsSet) item.input();
		}
		
		for(Employee item:list) {
			item.output();
		}
		
		/*
			All object in class will inherit toString method
		 	and in class toString method was Overridden and return to String representation
		 	So I just need to use emp1,emp2 instead of emp1.toString()
		 */
		
		/*
			When the method in Employee and pTimeEmployee have the
			same name it will choose the method of subclass
			(pTimeEmployee) because it will override to parent
		 */
	}

}
