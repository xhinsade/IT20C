
package LinkedLIst_Int;

public class LinkedList {
    
    private Node head;

    //Method use to add new Node at the end of the list
    public void add(int data){
        Node newNode = new Node(data);

        if ( head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    
    }
}
