public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1225));
    }
    public static int sumFirstAndLastDigit(int number) {
        int tempNumber = number;

        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            int firstDigit = 0;
            int count = 0;

            while (tempNumber > 0) {
                tempNumber = tempNumber / 10;
                count++;
            }
            firstDigit = (int) (number / Math.pow(10, count - 1));
            return firstDigit + lastDigit;
        }
    }
}
