public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= 10 && firstNumber <= 1000) && (secondNumber >= 10 && secondNumber <= 1000) && (thirdNumber >= 10 && thirdNumber <= 1000)) {
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            int thirdNumberLastDigit = thirdNumber % 10;

            return (firstNumberLastDigit == secondNumberLastDigit)
                    || (secondNumberLastDigit == thirdNumberLastDigit)
                    || (firstNumberLastDigit == thirdNumberLastDigit);
        }
        return false;
    }

    public static boolean isValid(int number){
        if (number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }
}
