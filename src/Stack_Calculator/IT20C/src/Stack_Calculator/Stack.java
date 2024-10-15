/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Calculator;

/**
 *
 * @author ITLAB1-PC05-STUDENT
 */
public class Stack {
    
    private int maxSize;
    private int [] stackArray;
    private int top;
    
    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new int [maxSize];
        this.top = -1;
    }
    
    public boolean isEmpty(){
        return (top == -1 );
    }
    
    public boolean isFull(){
        return (top == maxSize - 1);
    }
    
    public int size(){
        return top +1;
    }
    
    public void push(int value){
        if(isFull()){
            System.out.println(" The Stack is Full. You can no longer push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println(" Stack is empty. Cannot Pop. ");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty. Cannot Peek.");
            return -1;

        }
        return stackArray[top];
    }

}
