import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        printArray(reverseIntegers(myIntegers));

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
