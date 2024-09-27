
package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class PersonInfo {

    

    private ArrayList<String> info;

    public PersonInfo() {
        info = new ArrayList<>();
    }
     
    Scanner sc = new Scanner(System.in);

    //Display the Information After Filling In
    public void DisplayPersonInfo() {
        System.out.println("Your Information : ");
        System.out.println("---------------------");
        for (String detail : info) {
            System.out.println(detail);
        }
    }

    //Method For the Inserted User input 
    public void InsertInfo(String name, int age, String gender, String address, String number) {
        info.add("Name: " + name);
        info.add("Age: " + age);
        info.add("Gender: " + gender);
        info.add("Address: " + address);
        info.add("Phone Number: " + number);
    }
    

    //Method For Finding the Information
    public String findInfo(String searchInfo) {
        for (String detail : info) {
            if (detail.contains(searchInfo)) {
                return detail;
            }
        }
        return null;
    }

    //Method For Getting the Index When Finding The Information
    public int getInfoIndex(String searchInfo) {
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).contains(searchInfo)) {
                return i;
            }
        }
        return -1;
    }
    
    //Method For Updating User Information
public void updateInfo(int index, String newInfo) {
    if (index >= 0 && index < info.size()) {
        String currentInfo = info.get(index);
        
       
        String[] parts = currentInfo.split(": ", 2);
        String updatedInfo = parts[0] + ": " + newInfo; 
        
        System.out.println("Are you sure you want to update " + currentInfo + " to " + updatedInfo + "? (yes/no)");
        String confirmation = sc.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {
            info.set(index, updatedInfo);
            System.out.println("Updated: " + currentInfo + " to " + updatedInfo);
        } else {
            System.out.println("Update canceled.");
        }
    } else {
        System.out.println("Index out of bounds");
    }
}

    //Method For Deleting the User Information

    public void deleteInfo(int index) {
    if (index >= 0 && index < info.size()) {
        String removedInfo = info.get(index);

        System.out.println("Are you sure you want to delete " + removedInfo + "? (yes/no)");
        String confirmation = sc.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {
            info.remove(index);
            System.out.println("Deleted: " + removedInfo);

            
            for (int i = index; i < info.size(); i++) {
                
            }
        } else {
            System.out.println("Deletion canceled.");
        }
    } else {
        System.out.println("Invalid index.");
    }
}
}
