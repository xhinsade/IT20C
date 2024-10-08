
package Stack;


public class Stack {
    
    private int maxSize;
    private int [] StackArray;
    private int top;
    
    public Stack(int size){
        this.maxSize = size;
        this.StackArray = new int [maxSize];
        this.top = -1;
    }
}
