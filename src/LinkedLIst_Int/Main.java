
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
     }
}
