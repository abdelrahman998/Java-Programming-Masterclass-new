public class NumberToWords {
    public static void main(String[] args) {


        System.out.println(reverse(12345));

        numberToWords(123);
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int digitCount = getDigitCount(number);
        number = reverse(number);
        for (int i = digitCount; i > 0; i--) {
            switch (number % 10) {
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Zero ");
            }
            number = number / 10;
        }

    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // 128 =

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + (number % 10);
            number = number / 10;
        }
        return reverseNumber;
    }


}






