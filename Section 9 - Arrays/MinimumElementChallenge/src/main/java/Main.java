import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

//        int returendMin = findMin(returnedArray);
//        System.out.println("min = " + returendMin);
//
//        reverseArray(returnedArray);
//        System.out.println(Arrays.toString(returnedArray));

        int[] reversedCopy = reverseCopy(returnedArray);
        System.out.println("array before reverse = " + Arrays.toString(returnedArray));
        System.out.println("array after reverse = " + Arrays.toString(reversedCopy));

    }

    private static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;

    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min){
                min = element;
            }
        }

        return min;
    }

    private static int[] reverseArray(int[] array) {

        int halfLength = array.length / 2;
        int maxIndex = array.length - 1;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex- i] = temp;
        }
        return array;
    }


    private static int[] reverseCopy(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int element : array ) {
            reversedArray[maxIndex--] = element;
        }

        return reversedArray;
    }





}
