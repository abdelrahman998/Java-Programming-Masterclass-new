public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit=number;


        while (number!=0){
            reverse = reverse*10 + number%10;
            number = number/10;
        }
        if(reverse==lastDigit) {
            return true;
        }
        return false;

    }
}