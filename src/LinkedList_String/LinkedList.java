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
    
    public void deleteByValue( String value){
        
        if(head == null) return;
        
        if(head.data.equals(value)){
            head = head.next;
            return; 
        }
        Node current = head;
        while (current.next != null){
        if (current.next.data.equals(value)){
            current.next = current.next.next;
            return;
        }
        current = current.next;
        }
    }

   // Method to move a node
    public void moveNodePointer(int currentIndex, int newIndex) {
        if (head == null || currentIndex == newIndex) return;

        Node current = head;
        Node prev = null;
        Node movingNode = null;
        Node movingPrev = null;

        for (int i = 0; current != null && i < currentIndex; i++) {
            movingPrev = prev;
            prev = current;
            current = current.next;
        }

        movingNode = current; // The node to move
        if (movingNode == null) return; // Node doesn't exist

        // Remove movingNode from its current position
        if (movingPrev != null) {
            movingPrev.next = movingNode.next; // Bypass movingNode
        } else {
            head = movingNode.next; // Moving the head
        }

        // Insert movingNode at the new position
        current = head;
        prev = null;

        for (int i = 0; current != null && i < newIndex; i++) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            movingNode.next = current; // Point to the next node
            prev.next = movingNode; // Link the previous node to movingNode
        } else {
            movingNode.next = head; // Insert at the head
            head = movingNode; // Update head
        }
    }

    // Method to swap two nodes
    public void swapNodes(int index1, int index2) {
        if (head == null || index1 == index2) return;

        Node current = head;
        Node prev1 = null, prev2 = null;
        Node node1 = null, node2 = null;

        // Find the nodes and their previous nodes
        for (int i = 0; current != null; i++) {
            if (i == index1) {
                node1 = current;
            } else if (i == index2) {
                node2 = current;
            }
            if (node1 == null) prev1 = current;
            if (node2 == null) prev2 = current;
            current = current.next;
        }

        if (node1 == null || node2 == null) return; // One of the nodes doesn't exist

        // If node1 is not the head
        if (prev1 != null) {
            prev1.next = node2;
        } else {
            head = node2; // node2 is the new head
        }

        // If node2 is not the head
        if (prev2 != null) {
            prev2.next = node1;
        } else {
            head = node1; // node1 is the new head
        }

        // Swap next pointers
        Node temp = node2.next;
        node2.next = node1.next;
        node1.next = temp;
    }
}