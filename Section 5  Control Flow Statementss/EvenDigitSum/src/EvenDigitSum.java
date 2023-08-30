public class EvenDigitSum{
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(124)); // 6
        System.out.println(getEvenDigitSum(28554)); // 14
        System.out.println(getEvenDigitSum(15663)); // 12
    }

    // 124 => 124 % 10 = 4 => 124 - 4 = 120 => 120 / 10 = 12 =>

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        while (number > 0){
            int lastDigit = number % 10;
            number = number / 10;

            if (lastDigit % 2 == 0){
                sum +=lastDigit;
            }

        }
        return sum;
    }
}
