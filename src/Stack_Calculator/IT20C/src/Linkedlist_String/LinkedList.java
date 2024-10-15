
package Linkedlist_String;


public class LinkedList {
    
    private Node head;

    // Node inner class
    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    
     // Method to Add Song
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
     // Method to Print the List of Songs
    public void ShowList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
      // Method to Delete By Value
    public void deleteByValue(String value) {
        if (head == null) return;

        if (head.data.equals(value)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
     
                    // Method to move or swap nodes
   public void moveOrSwapNodes(int index1, int index2, boolean swap) {
    if (head == null || index1 < 0 || index2 < 0 || index1 == index2) return;

    Node prev1 = null, prev2 = null, node1 = head, node2 = head;

    // Find nodes and their previous nodes
    for (int i = 0; i < Math.max(index1, index2); i++) {
        if (i < index1) {
            prev1 = node1;
            node1 = node1.next;
        }
        if (i < index2) {
            prev2 = node2;
            node2 = node2.next;
        }
    }

    // If either node is null, return
    if (node1 == null || node2 == null) {
        System.out.println("Invalid indices.");
        return;
    }

    if (swap) {
        // Swap logic
        if (prev1 != null) {
            prev1.next = node2;
        } else {
            head = node2; // node2 is the new head
        }

        if (prev2 != null) {
            prev2.next = node1;
        } else {
            head = node1; // node1 is the new head
        }

        // Swap next pointers
        Node temp = node2.next;
        node2.next = node1.next;
        node1.next = temp;
    } else {
        // Move logic
        if (prev1 != null) {
            prev1.next = node1.next;
        } else {
            head = node1.next; // Moving head
        }

        // Insert node1 at index2
        if (index2 == 0) {
            node1.next = head;
            head = node1;
            return;
        }

        Node newPrevNode = head;
        for (int i = 0; i < index2 - 1; i++) {
            if (newPrevNode == null) return; // Invalid new index
            newPrevNode = newPrevNode.next;
        }

        node1.next = newPrevNode.next;
        newPrevNode.next = node1;
    }
   }
   
}
