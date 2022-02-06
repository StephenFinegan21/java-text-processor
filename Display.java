import java.util.Scanner;


public class Display{
    private String inputString;                                 //stores user input for an individual paragraph
    private String combinedString;                              //combined paragraphs into a string
    private int numberOfParas;                                  //How many paragraphs the programme will take
    private StringBuffer combinedText = new StringBuffer();     //use a stringBuffer to append all the strings together
    private int numberOfWords;                                  //The amount of words that will be in the array
    Scanner keyboard = new Scanner(System.in);

    

public Display(){
    

}

//Prompt user for Q1 - How many paragraphs to enter
public void askUserForParagraph(){
    System.out.println("How many paragraphs would you like to encode?");
        numberOfParas = keyboard.nextInt();
}

//Combine the individual paragraphs into one String
public void combineParagraphtext(){
    int i = 1;                                  //Start at 1 - want to ask user for paragraph 1...,  not 0...
    while(i <= numberOfParas +1){               
        inputString = keyboard.nextLine();      //user input saved to a String
        if(i > numberOfParas){
            System.out.println("-----");
        }else{
            System.out.println("Please enter paragraph " + i + " of " + numberOfParas);
        }
        combinedText.append(inputString);       //in each loop append the new String onto the String buffer
        i++;
    }                                           //All strings are now saved together in a stringbuffer
     combinedString = combinedText.toString();  //Covert StringBuffer back to String
}

//Getter for the combined paragraph string
public String getCombinedParagraphText(){
    return combinedString;
}

//Prompt user for q2 - find longhest string in array
public void askUserForArrayLength(){
    System.out.println("How many words would you like to enter into array?");
    numberOfWords = keyboard.nextInt();    //user sets amiount of strings to be in array
}

//Add in the Strings and return the full array
public String[] createUserArray(){
    String[] arrayString = new String [numberOfWords + 1];

    for(int j = 0; j<=numberOfWords; j++){
        arrayString[j] = keyboard.nextLine();
        System.out.println("Enter a word to check");
        }
    return arrayString;
}

//Display the longest word or words in the array
public void displayLongWordArray(String[] array){   
    String[] longWordArray = array;
    for(int j = 0; j< longWordArray.length; j++){
        System.out.println("longest --- " + longWordArray[j]);
    }
}








}