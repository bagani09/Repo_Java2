package TestPkg;
/**
 *
 * Store your first name in a variable, and display the following:
 *     1. Display length of the first name.
 *     2. Does your name starts with "K" (Considering cases)
 *     3. First alphabet of your name
 *     4. Does your name ends with "M" (Ignoring cases)
 *
 * String myStatment = "I am a good programmer";
 * Use string methods to do following tasks:
 * 	1. Fetch the last word of the sentence
 * 	2. Display the total number of words in the myStatement.
 * 	3. replace all the 'r' characters with 'f' characters.
 *
 * Store your first name in a string variable.
 * Calculate the length of your name, without using length() method of String class.
 */

public class Homework {
    public static void main(String[] args) {

        // First part of Homework

        String firstName = "Ani";
        int lengthOfFN = firstName.length();
        System.out.println("Length of my first name is :" + " " + lengthOfFN);

        boolean startsWithK = firstName.toUpperCase().startsWith("K");
        System.out.println("Does my name starts with K :" + " " + startsWithK);

        char firstAlphabet = firstName.charAt(0);
        System.out.println("First alphabet of my name is :" + " " + firstAlphabet);

        boolean endsWithM = firstName.toUpperCase().endsWith("M");
        System.out.println("Does my name ends with M?:" + " " + endsWithM);

        // Second part of Homework

        String myStatement = "I am a good programmer";
        String [] getLastPart = myStatement.split(" ");
        String lastWord = getLastPart [getLastPart.length - 1];
        System.out.println("Last word in myStatement variable is :" + " " + lastWord);


        String myStatment = "I am a good programmer";
        String [] afterSplit = myStatement.split(" ");
        int numberOfWords = afterSplit.length;
        System.out.println("The total number of words in the myStatement is :" + " " + numberOfWords);


        String replaceRwithF = myStatment.replace('r', 'f');
        System.out.println("Replacing all r characters with f characters :" + " " + replaceRwithF);

        // Third part of homework
        // Store your first name in a string variable.
        // Calculate the length of your name, without using length() method of String class.

        String myName = "Ani";
        int nameLength = myName.lastIndexOf("");
        System.out.println("Length of my name :" + " " + nameLength);














    }
}
