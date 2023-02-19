//Truong Cong Trinh - DE170768
package GUI;
import DTO.*;
import java.util.Scanner;

public class AntiqueShop {
        public static void main(String[] args){
        String[] options = {" Create a Vase"," Create a Statue", // Create an array of String type
            " Create a Painting"," Display the item"};          // 
        Item item = null; // Item is a variable and reference to nothing 
                          //  or not pointing to actual Item object 
        int choice = 0; // initial choice with value 0
       Scanner sc= new Scanner(System.in); //  // declaring an object of class Scanner
        do{
            choice=Menu.getChoice(options); // 
            switch(choice){
            case 1:
            item= new Vase();
            ((Vase)item).inputVase();
            break; 
            case 2:
            item = new Statue();
            ((Statue) item).inputStatue(); 
            break;
            case 3:
            item = new Painting();
            ((Painting) item).inputPainting();
            break;
            case 4:
            if(item!=null){
                if(item instanceof Vase)
                    ((Vase) item).outputVase();
                else if(item instanceof Statue)
                    ((Statue) item).outputStatue ();
                else if(item instanceof Painting)
                    ((Painting) item).outputPainting (); 
            }
                else System.out.println("you need to create an object");
                break;
            }
         } while(choice<=4); 
    }
}

