
package Simple_Implementation;


public class Simple_Implementation {

    
    public static void main(String[] args) {
        
        //declaring variable inside array"
        String [] fruits = {"Watermelon", "Grapes", "Apple", "Orange"};
          
        
       //printing what fruit using the index inside the array
       
        System.out.println(fruits[1]);
        System.out.println(fruits[3]);
        System.out.println(fruits[2]);
        
        //output
        /* Grapes
           Orange
           Apple */
        
        //declaring numbers inside array"
        int [] numValue = {90, 32, 56,98,100};
        
         //procedure
        System.out.println("The number inside the array is : " + numValue.length);
        
        //output
        //The number inside the array is : 5
        
        ////declaring numbers inside array"
        int [] num = {2,8,12,16,20};
        
        //procedure
        System.out.println("Sum : " + (num[1] + num[2]));
        System.out.println("Difference : " + (num[3] - num[2]));
        System.out.println("Product : " + (num[1] * num[2]));
        System.out.println("Quotient : " + (num[3] / num[2]));
        
        //output
        /*
        Sum : 20
        Difference : 4
        Product : 96
        Quotient : 1
        
        */
    }
    
}
