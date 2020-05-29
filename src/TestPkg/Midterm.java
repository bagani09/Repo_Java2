package TestPkg;


import java.util.Arrays;

public class Midterm {
    public static void main(String[] args) {

        int [] numbers = {5, 63, 42, 4, 7, 8, 5, 86};
        System.out.println(missingSmallestNum(numbers));
        speedCalculator(90);


    }

    /**
     * Question 1:
     * Create a method to return an array after remove a specific value from a given int array.
     * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     * <p>
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */

    public static int[] array(int[] original, int numberToRemove) {
        int num = 0;
        int lengthOfAnArray = original.length;
        for (int originals : original) {
            if (originals == numberToRemove) {
                num++;

                int[] returnedArray = new int[lengthOfAnArray - num];
                int j = 0;
                for (int i = 0; i < lengthOfAnArray; i++) {
                    if (original[i] != numberToRemove) {
                        returnedArray[j] = original[i];
                        j++;

                    }
                    return returnedArray;
                }
            }

        }

        return original;
    }


    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0) from given array.
     * Example:
     * For array : {1, 3, 5, 4, 2, 7}
     * Method should return : 6
     * <p>
     * For array : {-1, -3, 4, 2}
     * Method should return : 1
     * <p>
     * For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * Method should return : 4
     **/

    public static int missingSmallestNum(int[] givenArray) {
        int number = givenArray[0];
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] < number) {
                number = givenArray[i];
            }

        }
        return number;
    }


    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points charged against the license for over speeding.
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user gets 12 points for a speed then license is suspended
     *
     *  Example:
     *      user speed = 78 ; 1 points
     *      user speed = 88 ; 3 points
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     **/


    public static void speedCalculator (double yourSpeed){
        double speedLimit = 70;
        double extraMiles = yourSpeed-speedLimit;
        double points = 0;
        System.out.println("Your speed : " + yourSpeed + "mph");
        System.out.println("Speed Limit : " + speedLimit + "mph");
        if (yourSpeed > speedLimit){
            System.out.println("You were going " + extraMiles + "mph over the speed limit");
            points = extraMiles/5;
            System.out.println("**" + "You get " + points + " points against your licence" + "**");
        if (points >= 12){
            System.out.println("You got " + points + " points against your licence. Your licence is suspended");
        }

        }
        else {
            System.out.println("Thank you for driving within the speed limit");
        }



    }

}

