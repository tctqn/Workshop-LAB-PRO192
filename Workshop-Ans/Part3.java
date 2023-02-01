package workshop1;
import java.util.Scanner;
public class Part3 {
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
        String[] list = new String[10];
        for(int i=0;i<10;i++) {
            Scanner inp = new Scanner(System.in);
            list[i] = inp.nextLine();
        }
        System.out.println("===============================");
        for(int i=0;i<10;i++) {
            var res = Normalize(list[i]);
            System.out.println(res);
        }

    }

 }
