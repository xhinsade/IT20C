
package LinkedList_String;

import java.util.Scanner;

public class Main {
    
    public static void main(String [] args){
    LinkedList list = new LinkedList();
    Scanner sc = new Scanner(System.in);
    
    list.add(" Agora Hills - Doja Cat");
    list.add(" Fantasize - Ariana Grande");
    list.add(" Sining - Dionela ft. Jay R");
    list.add(" Sugar - Florida");
    list.add(" Lil Kasalanan - Hev Abi");
    list.add(" Walang Alam -  Hev Abi");
    
    boolean running = true;
        while (running) {
            System.out.println("\nCurrent Music List:");
            System.out.println("----------------------------");
            list.ShowList();
            System.out.println("----------------------------");
            System.out.println("Choose an option:");
            System.out.println("1. Add a song");
            System.out.println("2. Delete a song");
            System.out.println("3. Move a song");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            
            System.out.println( );
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the song title to add: ");
                    String songToAdd = sc.nextLine();
                    list.add(songToAdd);
                    System.out.println("Song added.");
                    break;
                case 2:
                    System.out.print("Enter the song title to delete: ");
                    String songToDelete = sc.nextLine();
                    System.out.print("Are you sure you want to delete \"" + songToDelete + "\"? (yes/no): ");
                    String confirmation = sc.nextLine();
                    if (confirmation.equalsIgnoreCase("yes")) {
                        list.deleteByValue(songToDelete);
                        System.out.println("Song deleted.");
                    } else {
                        System.out.println("Deletion canceled.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the current index of the song to move: ");
                    int currentIndex = sc.nextInt();
                    System.out.print("Enter the new index for the song: ");
                    int newIndex = sc.nextInt();
                    list.moveNodePointer(currentIndex, newIndex);
                    System.out.println("Song moved.");
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Goodbye!");
    }
}
