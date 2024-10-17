/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CustomerQueue customerQueue = new CustomerQueue();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("\nMenu:");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve customer");
            System.out.println("3. Display queue");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

        switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    customerQueue.enqueue(new Customer(name));
                    break;
                case 2:
                    customerQueue.dequeue();
                    break;

        }
        
    }
    
}
