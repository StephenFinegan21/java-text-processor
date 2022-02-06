class TextProcessor{
    private String totalChars;          //holds number of characters in the string paragraph
    private String totalExclamations;   //holds number of ! in the string
    private char lastLetter;            //Last letter of Stephen is 'n'
    private String inputString;         //User input
    private String returnedString;      //returned string after calculations are done (encoded paragraphs)
    private int numberOfLongWords;      //value that will be used to set length of the new array that holds longest word/words
    private int longestCount;           //value that holds the value of the length of the longest word
   

    StringBuffer text = new StringBuffer(); //Stringbuffer that will allow us to append/remove values from the String
    String inputArray[];                    //User inputted array to check longest string
    

    public TextProcessor(){
        totalChars = "0";
        totalExclamations = "0";
        lastLetter = 'n';
        returnedString = "";
        
     }

    //Setter method for the String to be worked on
    public void setInputString(String inputString){
        this.inputString = inputString;
        totalChars = Integer.toString(inputString.length()); //Set totalChars to the length of the passed in String
    }

    //getter method for the new String
    public String getEncodedString(){
        return returnedString;
    }

    //getter to return the number of ! in a string
    public String getNumberOfExclamations(){
        int count  = 0;                                 //initialise a count
        for(int i = 0; i<inputString.length(); i++){    //loop through string
            if(inputString.charAt(i) == '!'){           //if it finds an !
                count ++;                               //increase count by 1
            }
        }
        totalExclamations = Integer.toString(count);    //convert the count to a String and store in the variable totalExclamations
        return totalExclamations;                       //return a string that shows the number of !
    }

    //Calculation method
    public void encode(){
        totalExclamations = getNumberOfExclamations();  //get the number of ! in the String
        
        for(int i = 0; i<inputString.length(); i++){    //Loop through String
            text.append(inputString.charAt(i));         //append each character in the String onto the Stringbuffer
            if(inputString.charAt(i) == ' '){           //if a char is a blank space (' ')
                text.append(lastLetter + totalChars );  //append the lastLetter (n) and the total number of characters in the String onto the Stringbuffer
            }
            if(inputString.charAt(i) == '.'){           //if a char is a full stop ('.')
                text.append(totalExclamations );        //append value of totalExclamations variable onto stringbuffer
             }
        }

        //Now need to remove full stops and spaces
        for(int i = 0; i < text.length()-1; i++){               //Loop through Stringbuffer
            if(text.charAt(i) == '.' || text.charAt(i) == ' '){ //if a character is a full stop or blank space
             text.deleteCharAt(i);                              //Delete that char at the current index
             }
        }
        returnedString = text.toString();                       //Covert Stringbuffervalue to String and store in returnedString variable.
                                                                //Can now be returned to the user with a getter
     }


     public void setInputArray(String[] inputArray){
        this.inputArray = inputArray;
    }



    public void calculateLongestWords(){                        
        for(int i = 0; i<inputArray.length; i++){               //Loop through array of words
            if(inputArray[i].length() > longestCount){          //if the length of the current word is longer than the current longest count
                longestCount = inputArray[i].length();          // update the longest count
                numberOfLongWords = 1;                          //reset number of longest words to 1
            }
            else if(inputArray[i].length() == longestCount){    //If the length of the current word is the same as the current longest
                numberOfLongWords ++;                           //Increase the longestword count
            }
        }
        
    }

    public String[] getLongWordsArray(){
        String[] returnedArray = new String[numberOfLongWords];     //Make a new array that will be returned - set length to the amount of the longest words
        int count = 0;                                              //count to keep track of values in new array
        for(int i = 0; i< inputArray.length; i++){                  //loope through original array
            if(inputArray[i].length() == longestCount){             //If the current value length, matches the length of the previosly calculated longest value
                returnedArray[count] = inputArray[i];               //Put the current value in the new array
                count++;                                            //increase the count so the next value will be put in the next index
                }
        }
        return returnedArray;       //return the new array
    }

   



  















}