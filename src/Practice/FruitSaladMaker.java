
package Practice;

import java.util.Scanner;
import java.util.ArrayList;


public class FruitSaladMaker {
    Scanner sc = new Scanner(System.in);
    
    private ArrayList <String> item;
    
    public  FruitSaladMaker (){
    
    item = new ArrayList<>();
    
    
      }

        public void AddFruit() {
        System.out.println("Maximum of 5 Fruits");
        
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your desired fruit (or type 'done' to finish): ");
            String fruit = sc.nextLine();
            
            
            if (fruit.equalsIgnoreCase("done")) {
                break;
            }
            
            item.add(fruit);
        }
    }

    public void DisplayFruit() {
        System.out.println("Items in the list: " + item);
    }
    
}
