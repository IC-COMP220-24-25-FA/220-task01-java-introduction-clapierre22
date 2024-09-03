package edu.ithaca.dragon.practice;

import java.lang.classfile.instruction.ThrowInstruction;
import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        int largestNum = 0;

        if (first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException("Negative Numbers are not Allowed");
        }
        else {
            if (first > second && first > third){
                largestNum = first;
            }
            else if (second > first && second > third){
                largestNum = second;
            }
            else if (third > first && third > second){
                largestNum = third;
            }
            else if (first == second && first == third && second == third){
                largestNum = first;
            }
            return largestNum;
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        return ((originalPrice - (originalPrice * discountPercent)) + ((originalPrice - (originalPrice * discountPercent)) * salesTax));
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        Boolean gDog = true;

        if (yearsOld > 0){
            if (daysSinceShoesChewed > 0){
                if (fetchedThePaperToday == true){
                    gDog = true;
                }
                else {
                    gDog = false;
                }
            }
            else {
                gDog = false;
            }
        }
        else {
            gDog = false;
        }
        return gDog;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
