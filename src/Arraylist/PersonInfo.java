/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class PersonInfo {

    

    private ArrayList<String> info;

    public PersonInfo() {
        info = new ArrayList<>();
    }
     
    Scanner sc = new Scanner(System.in);

    public void DisplayPersonInfo() {
        System.out.println("Your Information : ");
        System.out.println("---------------------");
        for (String detail : info) {
            System.out.println(detail);
        }
    }

    public void InsertInfo(String name, int age, String gender, String address, String number) {
        info.add("Name: " + name);
        info.add("Age: " + age);
        info.add("Gender: " + gender);
        info.add("Address: " + address);
        info.add("Phone Number: " + number);
    }
    

    

    public int getInfoIndex(String searchInfo) {
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).contains(searchInfo)) {
                return i;
            }
        }
        return -1;
    }
}
