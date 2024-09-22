package Multidimentional_Array;

public class Multidimentional_Array {

    public static void main(String[] args) {

        String[][] nameAndPassword = {
            { "Kristine", " gd244deq"},
            { "Katelyn", " gd2qmkg34"},
            { "Jovan", " gdfhyyreq"}, 
            { "Israel", " lgre45eq"},
            { "Justine", "ldssu635"},
        };
        
            
            for (int i = 0; i < nameAndPassword.length; i++){
                for (int j = 0; j < nameAndPassword[i].length; j++){
                   
                    
                    System.out.print(nameAndPassword[i][j]);
                }
                System.out.println(" ");
            }

        
    }
}
