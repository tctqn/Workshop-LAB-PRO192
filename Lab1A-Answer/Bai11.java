package lab1a;


public class Bai11 {
    
    public static float GPAHT(float a[],int b[]) {
        float finalScore = 0;
        int j = 0, check = 0;
        for (float i:a) {
            check+=b[j];    
            finalScore+=(i*b[j++]);
        }
        return finalScore/check;
    }
    
    public static void main(String[] args) {
        float[] mark = {9,10,6,8,8,9};
        int[] heso = {1,1,2,1,1,2};
        float finalScore = GPAHT(mark, heso);
        System.out.println("GPA: "+ finalScore);
    }
  
}
