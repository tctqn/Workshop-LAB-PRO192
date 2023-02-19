package lab1a;
import java.util.Arrays;
import java.util.Scanner;
public class Bai13 {
    
    private static float[] CheckPoint(float a[]) {
        float[] res = new float[100];
        int check = 0, j = 0;
        for (float i:a) {
            if (i >= 5 && i<=10) {
                res[j++]+=i;
                check++;
            } else if ((i < 0 || i>10)) {
                return null;
            }
        }
        if (check==0) {
            return null;
        } return res;
    }
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Input number of points: ");
        int numsPoint = ip.nextInt();
        float[] arr = new float[numsPoint];
        System.out.print("Enter all points: ");
        for (int i = 0; i < numsPoint; i++) {
            arr[i] = ip.nextFloat();
        }
        if (CheckPoint(arr) == null) {
            System.out.println("null");
        } else {
            for (float i : CheckPoint(arr)) {
                if(i!=0) {
                    System.out.print(i + " ");
                }
                
            }
        }
        
        
            
    }
}
