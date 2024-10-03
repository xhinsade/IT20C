
package LinkedLIst_Int;

import java.util.Scanner;    

public class Main {
    
     public static void main(String [] args){
    LinkedList list = new LinkedList();
    Scanner sc = new Scanner(System.in);

        System.out.println(" Current Linked List: ");
        System.out.println("----------------------------");
   
   // Added the Elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
         list.printList();
         
          int choice;
         do {
            System.out.println("----------------------------");
            System.out.println("Choose an option:");
            System.out.println("1. Add a Node");
            System.out.println("2. Delete a Node by Value");
            System.out.println("3. Move a number");
            System.out.println("4. Exit");
            System.out.println(" Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            
             switch (choice) {
                case 1:
                    System.out.print("Enter the number to add: ");
                    int NumToAdd = sc.nextInt();
                    list.add(NumToAdd);
                    System.out.println( NumToAdd + " added.");
                    list.printList();
                    break;
                    
                     case 2:
                 System.out.print("Enter the number to delete: ");
                 int NumToDelete = sc.nextInt();
                 sc.nextLine(); 
                 System.out.print("Are you sure you want to delete " + NumToDelete + "? (yes/no): ");
                 String confirmation = sc.nextLine();
    
                if (confirmation.equalsIgnoreCase("yes")) {
                list.deleteByValue(NumToDelete);                     
                System.out.println(NumToDelete + " deleted.");
                list.printList();
                } else {
                 System.out.println("Deletion canceled.");
                }
                break;
                
                 case 3:
               System.out.print("Enter the current index of the number to move/swap: ");
                int currentIndex = sc.nextInt();
                System.out.print("Enter the new index for the number: ");
                int newIndex = sc.nextInt();
                list.moveNodePointer(currentIndex, newIndex);
                System.out.println("Node moved.");
                list.printList();  
                break;
             }
         }   
            while (choice != 4 );
         choice++;
        
     }
}
