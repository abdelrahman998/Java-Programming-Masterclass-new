import java.util.Scanner;

public class NextMain {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[5];

    public static void main(String[] args) {
        System.out.println("Enter 5 integers:");
        getInput();
        printArray(baseData);
        resizeArray();

        System.out.println("Enter 7");
        getInput();
        printArray(baseData);

    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static void resizeArray() {
        int[] original = baseData;

        baseData = new int[7];
        for (int i = 0; i < original.length; i++ ) {
            baseData[i] = original[i];
        }


    }






}
