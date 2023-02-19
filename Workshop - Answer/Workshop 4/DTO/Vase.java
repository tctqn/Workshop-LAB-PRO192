package DTO;

import java.util.Scanner;

public class Vase extends Item {
    private int height;
    private String material;
    
    //Methods
    public Vase() {}
    public Vase(int value,String creator,int height,String material) {
        super(value,creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void outputVase() {
        output();
        System.out.println("Height: " + this.height 
                    + "\nMaterial: " + this.material);
    }
    
    public void inputVase() {
        input();
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.println("Verify: Height>0, Material is not empty");
                System.out.print("Enter the Height: ");
                this.height = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the Material: ");
                this.material = sc.nextLine(); 
            } while (this.height <= 0 || "".equals(this.material));
        } catch (Exception e) {
            System.out.println("Make sure Height is 'Integer' numbers"
                    + " and Material is type 'String'");
        }
    }
    
}
