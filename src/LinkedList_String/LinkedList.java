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
public class LinkedList {
    
    private Node head;
    
    public void add(String data){
    
    Node newNode = new Node(data);
    if (head == null){
        head = newNode;
        return;
    }
    Node current = head;
    while(current.next != null){
        current = current.next;
    }
    current.next = newNode;
  }
    
    public void ShowList(){
        Node current =  head;
        while (current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println(" null ");
    }
}
