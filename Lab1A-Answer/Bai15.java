package lab1a;

public class Bai15 {
    
    private static int ConvertMark(char a) {
        if (a == 'A' || a == 'a') return 4;
        if (a == 'B' || a == 'b') return 3;
        if (a == 'C' || a == 'c') return 2;
        if (a == 'D' || a == 'd') return 1;        
        if (a == 'F' || a == 'f') return 0;
        return -1;
    }
    
    public static void main(String[] args) {
        char s = args[0].charAt(0);
        int res = ConvertMark(s);
        if (res!=-1) {
            System.out.println(res);
        } else  System.out.println("Invalid!!!");
    }
}
