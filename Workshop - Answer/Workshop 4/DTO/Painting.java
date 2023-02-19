package DTO;

import java.util.Scanner;

public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    
    
    //Methods
     
    public Painting() {}
    public Painting(int value,String creator,int height,int width,boolean isWatercolour,boolean isFramed) {
        super(value,creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void outputPainting() {
        output();
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Watercolour: " + this.isWatercolour);
        System.out.println("Framed: " + this.isFramed);
    }
    
    public void inputPainting() {
        int check = 0;
        Scanner sc = new Scanner(System.in);
        input();
        
        try {
            do {
                System.out.println("Verify: Height,Width > 0");
                System.out.print("Enter the Height: ");
                this.height = sc.nextInt();
                System.out.print("Enter the Width: ");
                this.width = sc.nextInt();
            } while (this.height<=0 || this.width<=0);
        } catch (Exception e) {
            System.out.println("Make sure Height and Width is the same type Integer!");
        }
            do {
                try {
                    System.out.print("Is it Watercolour: ");
                    this.isWatercolour = sc.nextBoolean();
                    System.out.print("Is it Framed: ");
                    this.isFramed = sc.nextBoolean();
                } catch (Exception e) {
                    check = 1;
                    System.out.println("Just allows 2 words 'True' or 'False' to set the value"
                    + " of Watercolor and Framed neither '0' or '1' nor 'T' or 'F' ");
                }
                
            } while(check==1);
    }
    
}
