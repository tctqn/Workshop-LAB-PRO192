package lab1a;

public class Bai10 {
    
    private static float CaclGPA(float[] listgrade) {
        float res = 0,temp = 0;
        for(float i:listgrade) {
            res+=i;
            temp++;
            if(i<0 || i>10) return -1;
        }
        return res/temp;
    }
    
    
    
    public static void main(String[] args) {
        float[] grade = {-1,10,10,10,10,10,10};
        System.out.println("Your GPA: " + CaclGPA(grade));
                
    }
}
