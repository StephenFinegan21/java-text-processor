import java.util.Scanner;

public class TextApp {     
    public static void main(String[] args) {
        
        TextProcessor encoder = new TextProcessor();         //Object where operations/calculations will be done
        Display display = new Display();                    //Object that handles user input and output
        String combinedString;
       
        //Question 1 - Encode the paragraphs
        display.askUserForParagraph();                      //Ask user how many paragraphs to encode
        display.combineParagraphtext();                     //Combine each paragraph together
        combinedString = display.getCombinedParagraphText();//Retrieve the combined data
       
       //Passes the combined paragraphs into the Textprocessor object with a setter method
        encoder.setInputString(combinedString);

        // Do the calculation on the String
        encoder.encode();

        //Return the processed String with a getter method and print to console.
        System.out.println(encoder.getEncodedString());

      
        
        //Question 2 - Find longest String/Strings
        display.askUserForArrayLength();
        String[]arrayString = display.createUserArray();        //Populates array and retrieves data

        encoder.setInputArray(arrayString);                     //Send retrieved data to be worked on
        encoder.calculateLongestWords();                        //Calculates longest word
        
        String[] longWordArray = encoder.getLongWordsArray();   //Stores array with longest word/words 
        display.displayLongWordArray(longWordArray);            //Displays them to user
        
        
    }
}
