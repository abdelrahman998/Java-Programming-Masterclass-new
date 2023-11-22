import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());



    }
    public static void moveZeroes(int[] nums) {

        int snowBallSize = 0;

        for (int i = 0; i < nums.length ; i++) {

            if (nums[i] == 0) {
                snowBallSize++;
            }

            else if (snowBallSize > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - snowBallSize] = temp;
            }

        }
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
    public static boolean isMonotonic(int[] nums) {

        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0 ; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) increasing = false;
            if (nums[i] < nums[i + 1]) decreasing = false;
        }

        return increasing || decreasing;
    }
}
