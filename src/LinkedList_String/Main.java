/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList_String;

/**
 *
 * @author ITLAB1-PC18-STUDENT
 */
public class Main {
    
    public static void main(String [] args){
    LinkedList list = new LinkedList();
    
    list.add(" Agora Hills - Doja Cat");
    list.add(" Fantasize - Ariana Grande");
    list.add(" Sining - Dionela ft. Jay R");
    list.add(" Sugar - Florida");
    list.add(" Lil Kasalanan - Hev Abi");
    list.add(" Walang Alam -  Hev Abi");
    
    System.out.println(" Current Music List");
    System.out.println(" ---------------------------- ");
    
    list.ShowList();
    
    list.deleteByValue(" Agora Hills - Doja Cat");
    System.out.println( );
    System.out.println(" Current Music List");
    System.out.println(" ---------------------------- ");
    
    list.ShowList();
    }
}
