# Text Processor app

* An application I built as part of a software development module in NCI
* Requirement was to use String buffers

## Function 1 - 

* Asks the user to encode a certain number of paragraphs
* Programme reads the inputted paragraphs and edits the data
* if a space is found, replace the space with 'n' and the total number of characters in the String 
* if a char is a full stop ('.')
* replace with the total number of exclamation marks '!' in the string

## Inputs

Inputs are handled with the Display.java class. In the main function in TextApp.java, a Display object its created and its functions, ‘askUserForParagraph’ is called to prompt the user for for input.
‘askUserForParagraph()’ asks the user to enter a number of how many paragraphs they would like to enter and the user enters an int.
Then the combineParagraphText() function is called which asks the user a number of times, depending on the previous number they entered, for some paragraphs.

## Processes

Each paragraph is appended onto a StringBuffer object so all the paragraphs are merged into a single Stringbuffer variable, and then converted into a String. This is returned back to the main app class, and then passed into the Textprocessor class through the setInputString() function.
The encode() function then appends the String onto another StringBuffer object and appends extra information onto it if certain conditions are met:
If the current character is an empty space - append ’n’ which is the last letter of my name and the total characters in the original string.
If the current character is a fullstops, append the total number of exclamation marks in the original string.
Once the extra information is appended, we can then remove the fullstops and spaces with the Stringbuffer.delete operation.

## Outputs

The returned String is returned back to the main app class with a getter and then printed to the user.





## Function 2 - 

* Asks the user to speciy how many words to compare
* Returns the longest word to the user


## Inputs

Once again the Display class handles the input, it calls the function askUserForArrayLength which asks the user how many words to be in the array. An array is made depending on what the user has passed in and user is prompted to pass in values to populate the array.

## Processes

The newly created array is passed back into the main app class and using a setter, setInputArray() is passed into TextProcessor to be worked on.
The returned String is returned back to the main app class with a getter and then printed to the user.
The method I chose to return the longest string or strings, was to make another array that would hold the longest strings. As an array needs to be given a length I needed to find the amount of longest words in the first array before making the second array to return.
The calculatelongestWords() function loops through the original array and calculates how many longest words are in the array, and also the length of the longest words.
Using these values we can first of all
- Createasecondarraythatcanfittheamountoflongestwordswehave
using the numberOfLongWords variable
- Loopthroughthefirstarray,findwordsthatmatchthe‘longestCount’
variable and put these into the new array.
The new array is then returned to the main app class.

## Outputs

Returned array is now printed out to the user by looping through and printing out each value in that array - display.displayLongWordArray().


