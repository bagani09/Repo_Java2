package TestPkg;

public class Homework2 {
    public static void main(String[] args) {

        /**
         * Create variable to store student-score, and total-possible-score based on the percentage,
         * display grade to student
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        double rightAnswers = 50;
        double maxQuestions = 80;
        double maxScore = 100;
        double studentScore = (rightAnswers / maxQuestions) * 100;
        if (studentScore > 0 && studentScore <= maxScore) {
            if (studentScore > 90 && studentScore <= 100) {
                System.out.println("Your percentage is : " + studentScore + "%" + " your grade is A ");
            }
            if (studentScore > 80 && studentScore <= 90) {
                System.out.println("Your percentage is : " + studentScore + "%" + " your grade is B ");
            }
            if (studentScore > 70 && studentScore <= 80) {
                System.out.println("Your percentage is : " + studentScore + "%" + " your grade is C ");
            }
            if (studentScore > 60 && studentScore <= 70) {
                System.out.println("Your percentage is : " + studentScore + "%" + " your grade is D ");
            }
            if (studentScore > 50 && studentScore <= 60) {
                System.out.println("Your percentage is : " + studentScore + "%" + " your grade is E ");
            }
            if (studentScore <= 50) {
                System.out.println("Your percentage is : " + studentScore + "%" + " your grade is F ");
            }

        } else {
            System.out.println("Fail. Try again");
        }


        /**
         * Checking car mode (P, D, N, R)
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */

        char carMode = 'P';
        String driveType = "Snow";
        if (carMode == 'P') {
            System.out.println("You are on " + carMode + " mode " + " you can park your car ");
        } else if (carMode == 'D') {
            switch (driveType) {
                case "Snow":
                    System.out.println("You are on snow mode");
                    break;
                case "Sport":
                    System.out.println("You are on sport mode");
                    break;
                case "Eco":
                    System.out.println("You are on eco mode");
            }
        } else if (carMode == 'N') {
            System.out.println("You are on " + carMode + " mode " + " Put car in a car wash ");
        } else if (carMode == 'R') {
            System.out.println("You are on " + carMode + " mode " + " You can reverse the car ");
        } else {
            System.out.println(" Invalid car mode ");
        }

        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */


        double number = 60;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is divisible by both");
        }
        if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("The number is divisible by 5");
        }
        if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("The number is divisible by 3");
        }
        if (number % 3 != 0 || number % 5 != 0) {
            System.out.println("The number is " + number);


        }


    }
}