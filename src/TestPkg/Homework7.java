package TestPkg;

import java.util.ArrayList;
import java.util.List;

public class Homework7 {
    public static void main(String[] args) {
        /**
         * Create a method, that will return all duplicates values in the given String array.
         * String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
         * Result -> ["happy", "joy", "laugh"]
         */


        List<String> duplicateValue = new ArrayList<>();
        duplicateValue.add("happy");
        duplicateValue.add("peace");
        duplicateValue.add("joy");
        duplicateValue.add("grow");
        duplicateValue.add("laugh");
        duplicateValue.add("happy");
        duplicateValue.add("laugh");
        duplicateValue.add("joy");
        System.out.println("Original array list: " + duplicateValue);
        for (int i = 0; i < duplicateValue.size(); i++) {
            for (int j = i + 1; j < duplicateValue.size(); j++) {
                if (duplicateValue.get(i).equals(duplicateValue.get(j))) {
                    System.out.println("Duplicate values in array list: " + duplicateValue.get(i));

                }
            }
        }


        /**
         * Create a method, that will return the common elements/value in two given int-array
         * int[] arr1 = {11, 32, 43, 54, 65}
         * int[] arr2 = {76, 11, 89, 43, 87, 23, 32}
         * Result -> [11, 32, 43]
         *
         */

        List<Integer> common = new ArrayList<>();
        common.add(15);
        common.add(25);
        common.add(35);
        common.add(45);
        System.out.println("First given list array: " + common);
        List<Integer> common2 = new ArrayList<>();
        common2.add(55);
        common2.add(65);
        common2.add(45);
        common2.add(25);
        common2.add(75);
        System.out.println("Second given list array: " + common2);

        for (int commons : common) {
            if (common2.contains(commons)) {
                System.out.println("Common values: " + commons);
            }


        }
    }
}

