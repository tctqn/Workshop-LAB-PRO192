package lab3;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		
		ArrayList<SoftBank> list = new ArrayList<SoftBank>();
		
		SoftBank s1 = new Central_Bank();
		SoftBank s2 = new North_Bank();
		
		list.add(s1);
		list.add(s2);
		
		for(SoftBank item:list) {
			item.input();
			
		}
		
		for(SoftBank item:list) {
			item.output();
			System.out.println(item.toString());
		}
		
	}

}
