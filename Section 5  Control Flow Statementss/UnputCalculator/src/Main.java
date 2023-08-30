import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        boolean hasNextInt = scanner.hasNextInt();
        while (hasNextInt){
            int number = scanner.nextInt();
            scanner.nextLine();
        }


        scanner.close();


    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long avg = 0;


            System.out.println("SUM=" + sum + " AVG=" + avg);
    }
}
