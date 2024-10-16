import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    private Queue<Customer> queue;

    public CustomerQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(Customer customer) {
        queue.add(customer);
        System.out.println(customer.getName() + " has joined the queue.");
    }

    public Customer dequeue() {
        if (!queue.isEmpty()) {
            Customer customer = queue.poll();
            System.out.println(customer.getName() + " has been served and left the queue.");
            return customer;
        } else {
            System.out.println("The queue is empty.");
            return null;
        }
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.println("Current queue:");
            for (Customer customer : queue) {
                System.out.println("- " + customer.getName());
            }
        }
    }
}
