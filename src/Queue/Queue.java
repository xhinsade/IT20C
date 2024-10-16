/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue {
private Queue<Customer> queue;
     
     public Queue () {
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
}
