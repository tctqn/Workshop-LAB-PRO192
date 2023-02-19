package DTO;
import java.util.Scanner;
public class Item {
    protected int value;
    protected String creator;
    
    //Methods
    
    public Item() {}
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void output() {
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.println("Verify: value>0, creator is not empty");
                System.out.print("Enter the Value: ");
                this.value = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the Creator: ");
                this.creator = sc.nextLine();
            } while(this.value <= 0 || "".equals(creator));
        } catch (Exception e) {
            System.out.println("Make sure Value is type Integer "
                    + "and Creator is type String");
        }
        
    } 
}
    

