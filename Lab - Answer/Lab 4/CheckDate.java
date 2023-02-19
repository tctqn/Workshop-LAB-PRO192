package lab4;
import java.time.LocalDate;
public class CheckDate {
	public static boolean checkDate(String date)
    {
		try {
        String dateParts[] = date.split("/");
        
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        
        
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
}