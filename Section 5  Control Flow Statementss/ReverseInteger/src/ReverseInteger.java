public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(11);
    }

    public static int reversedNumber(int number){
        int reversed = 0;
        int lastDigit = 0;

        while(number != 0){
            number = number / 10;

            reversed = (reversed * 10 ) + number % 10;
        }
        return reversed;
    }
}
