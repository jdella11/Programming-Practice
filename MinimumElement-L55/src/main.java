import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);

        System.out.println(findMin(myIntegers));
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

    public static int findMin(int[] input){
        int min=input[0]; //initialize minimum to first array value
        for (int i = 0; i < input.length; i++){
            if(input[i]<min){
                min=input[i];
            }
        }
        return min;
    }
}