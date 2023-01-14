package lab1a;

public class Bai14 {
    private static char ConvertMark(float n) {
        if (n < 4) return 'F';
        if (n >= 4 && n < 5.5) return 'D';
        if (n >= 5.5 && n < 7) return 'C';
        if (n >= 7 && n < 8.5) return 'B';
        return 'A';
    }
    public static void main(String[] args) {
        float n = Float.parseFloat(args[0]);
        if (n < 0 || n > 10) {
            System.out.println("Invalid!!!");
        } else {
            char res = ConvertMark(n);
            System.out.println(res);
        }
        
    }
}
