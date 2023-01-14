package lab1a;
import java.util.Scanner;
public class Bai18 {
    private static String Normalize(String name) {
        var words = name.toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for( var item:words) {
           var characters = item.toCharArray();
           characters[0] = Character.toUpperCase(characters[0]); 
           res.append(new String(characters));
           res.append(" ");
    }
    return res.toString().trim(); 
}
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        var res = Normalize(name);
        System.out.println(res);
    }

 }
