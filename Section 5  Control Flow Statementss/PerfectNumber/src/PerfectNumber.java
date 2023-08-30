public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {
        if (number > 0){
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            if (number == sum)
                return true;
        }
        return false;
    }
}
