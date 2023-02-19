package carmanager;

public class Car {

    String Color;
    int EnginePower;
    boolean Convertible;
    boolean ParkingBrake;

    //Constructor
    Car() {}
    Car(String Color,int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.Color = Color;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
    // getters
    public String getColour() {
        return this.Color;
    }

    public int getEnginePower() {
        return this.EnginePower;
    }
    
    public boolean Convertible() {
        return this.Convertible;
    }

    public boolean ParkingBrake() {
        return this.ParkingBrake ;
    }
    
    
    //setters
    
    public void setColour(String Color) {
        this.Color = Color;
    }
    
    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }
    
    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }
    
    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
    
    //Other logic method
    
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }
    
    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }
    
    public void output() {
        System.out.println("Car [Color=" + Color + ", EnginePower=" + EnginePower + ", Convertible=" + Convertible
					+ ", ParkingBrake=" + ParkingBrake + "]");
    }
    
}
