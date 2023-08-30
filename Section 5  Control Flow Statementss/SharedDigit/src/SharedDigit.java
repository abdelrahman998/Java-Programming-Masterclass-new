public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99)); // false
        System.out.println(hasSharedDigit(15, 55)); // true
        System.out.println(hasSharedDigit(12, 43)); // false

    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
            int lastDigitInNumber1 = number1 % 10;
            number1 = number1 / 10;

            int lastDigitInNumber2 = number2 % 10;
            number2 = number2 / 10;

            if ((number1 == number2) || (number1 == lastDigitInNumber2) || (lastDigitInNumber1 == number2) || (lastDigitInNumber1 == lastDigitInNumber2)) {
                return true;
            }
        }
        return false;
    }
}
