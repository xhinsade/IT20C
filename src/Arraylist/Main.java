
package Arraylist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        
    }
}
