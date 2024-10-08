
package Arraylist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //Scanner: Allowing the user to input text
        Scanner sc = new Scanner(System.in);
        PersonInfo infoList = new PersonInfo();

        System.out.println("Please Fill in the following:");
        System.out.println("--------------------------------");

        System.out.println("Please Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println(" ");

        System.out.println("Please Enter Your Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println(" ");

        System.out.println("Please Enter Your Gender: ");
        String gender = sc.nextLine();
        System.out.println(" ");

        System.out.println("Please Enter Your Address: ");
        String address = sc.nextLine();
        System.out.println(" ");

        System.out.println("Please Enter Your Phone Number: ");
        String number = sc.nextLine();
        System.out.println(" ");
        
        infoList.InsertInfo(name, age, gender, address, number);
        infoList.DisplayPersonInfo();
        
        
        //While Loop: Use to return the Question after Asking the User
        boolean continueOperations = true;
        while (continueOperations) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Find information");
            System.out.println("2. Update information");
            System.out.println("3. Delete information");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            
            //Procedure: For User to Find, Update, Delete
            switch (choice) {
                //Finding User Information
                case 1:
                    System.out.println("Enter the information you want to find (ex. Name, Age, Gender, Address, Phone Number): ");
                    String searchTerm = sc.nextLine();
                    String foundInfo = infoList.findInfo(searchTerm);

                    if (foundInfo != null) {
                        System.out.println("Found: " + foundInfo);
                    } else {
                        System.out.println("Information not found.");
                    }
                    break;
                

                    //Updating the User Information
                case 2:
                    System.out.println("Enter the information you want to update (ex.  Name, Age, Gender, Address, Phone Number): ");
                    String searchInfo = sc.nextLine();
                    int indexToUpdate = infoList.getInfoIndex(searchInfo);

                    if (indexToUpdate != -1) {
                        System.out.println("Enter the new information: ");
                        String newInfo = sc.nextLine();
                        infoList.updateInfo(indexToUpdate, newInfo);
                        infoList.DisplayPersonInfo();  
                    } else {
                        System.out.println("Information not found.");
                    }
                    break;
                    
                    //Deleting the User Information
                case 3:
                    System.out.println("Enter the information you want to delete (ex. Name, Age, Gender, Address, Phone Number): ");
                    searchInfo = sc.nextLine();  
                    int indexToDelete = infoList.getInfoIndex(searchInfo);

                    if (indexToDelete != -1) {
                        infoList.deleteInfo(indexToDelete);
                        infoList.DisplayPersonInfo();  
                    } else {
                        System.out.println("Information not found.");
                    }
                    break;

                    //To Exit
                case 4:
                    continueOperations = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("You have input invalid key, Please try Again.");
                    break;
            }
        }
        
        
    }
}
