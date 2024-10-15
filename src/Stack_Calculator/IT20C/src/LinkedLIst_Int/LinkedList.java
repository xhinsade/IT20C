
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
    
     //Method use to print the linked list
    public void printList(){
        Node current = head;

        while(current != null ){
            System.out.print( current.data + " -> ");
            current = current.next;
        }
        System.out.println( " null ");
    }
    
     //Method use to Delete a Node by Value
    public void deleteByValue(int value){
        if (head == null) return;

        //if the head needs to be removed 
        if (head.data == value){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null){
            if(current.next.data == value){
                current.next = current.next.next;
                return;
            }
            current = current.next;

            }
        }
    
    //,Method use to Move a Node to a new position / swap nodes
        public void moveNodePointer(int currentIndex, int newIndex) {
    if (currentIndex == newIndex) {
        System.out.println("Current index and new index are the same. No movement needed.");
        return;
    }

    // Step 1: Find the node at currentIndex and its previous node
    Node prevNode = null;
    Node currentNode = head;
    for (int i = 0; i < currentIndex; i++) {
        prevNode = currentNode;
        currentNode = currentNode.next;
        if (currentNode == null) {
            System.out.println("Invalid current index.");
            return;
        }
    }

    // Step 2: Remove the node from the current position
    if (prevNode != null) {
        prevNode.next = currentNode.next; // Skip the currentNode
    } else {
        head = currentNode.next; // The head was removed
    }

    // Step 3: Insert the node at the new index
    Node newPrevNode = null;
    Node newNode = head;
    for (int i = 0; i < newIndex; i++) {
        newPrevNode = newNode;
        newNode = newNode.next;
        if (newNode == null && i < newIndex - 1) {
            System.out.println("Invalid new index.");
            return;
        }
    }

    if (newPrevNode != null) {
        currentNode.next = newNode; // Place it after newPrevNode
        newPrevNode.next = currentNode;
    } else {
        currentNode.next = head;
        head = currentNode;
    }

    System.out.println("Node moved from index " + currentIndex + " to " + newIndex);
 }
}
