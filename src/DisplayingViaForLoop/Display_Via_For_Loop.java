package DisplayingViaForLoop;

public class Display_Via_For_Loop {

    public static void main(String[] args) {

        //declaring variable to the array 
        String[] charactersName = {"Lilith", "Mavis", "Luffy", "Ace", "Zoro"};

        //procedure to print the names inside the array
        for (int i = 0; i < charactersName.length; i++) {
            System.out.println(charactersName[i]);

            //output
            /*Lilith
           Mavis
           Luffy
            Ace
            Zoro */
        }
    }

}
