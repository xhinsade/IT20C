

package Stack;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of stack: ");
        int StackSize = sc.nextInt();
        Stack stack = new Stack(StackSize);

        boolean running = true;

        while(running){
        System.out.println(" What do you want to do next?  ");
        System.out.println("1. Push Stack");
        System.out.println("2. Pop Stack");
        System.out.println("3. Peek a Stack");
        System.out.println("4. Check stack if Empty");
        System.out.println("5. Check stack if Full");
        System.out.println("6. Display stack Size");
        System.out.println("7. Exit ");
        System.out.println(" Please select your choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
            System.out.println(" Enter a value to push");
            int value = sc.nextInt();
            stack.push(value);
                
                break;

                case 2:
                System.out.println(" Pop Element: " + stack.pop());
                break;
        
            default:
                break;
        }
        }

    }
}
