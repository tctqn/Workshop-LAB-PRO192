package DTO;

import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;
    
    //Methods
    public Statue() {}
    public Statue(int value,String creator,int weight,String colour) {
        super(value,creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void outputStatue() {
        output();
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
    }
    
    public void inputStatue() {
        Scanner sc = new Scanner(System.in);
        input();
        try {
            do {
                System.out.println("Verify: Weight>0, Colour is not empty");
                System.out.print("Enter Weight: ");
                this.weight = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Colour: ");
                this.colour = sc.nextLine();
            } while (this.weight <=0 || "".equals(this.colour));
        } catch (Exception e) {
            System.out.println("Make sure Weight is type Integer"
                    + " and Colour is type String ");
        }
        
    }
}

