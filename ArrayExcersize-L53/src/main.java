/*
Create a program using arrays that sorts a list of integers in descending order.
Descending order is highest value to lowest.
In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
ultimately have an array with 106,81,26, 15, 5 in it.

Set up the program so that the numbers to sort are read in from the keyboard.

Implement the following methods - getIntegers, printArray, and sortIntegers

getIntegers returns an array of entered integers from keyboard

printArray prints out the contents of the array

and sortIntegers should sort the array and return a new array containing the sorted numbers

you will have to figure out how to copy the array elements from the passed array into a new
array and sort them and return the new sorted array.
*/

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        int[] sortedIntegers = sortIntegers(myIntegers);
        printArray(reverseIntegers(sortedIntegers));

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number+" integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortIntegers(int[] input){
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }

    public static int[] reverseIntegers(int[] input){
        int[] output = new int[input.length];
        int temp;
        for(int i = 0; i <input.length; i++){
            temp=input[i];
            output[(input.length-1)-i]=temp;
        }
        return output;
    }
}
