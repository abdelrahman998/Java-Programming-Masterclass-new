public class SumOdd {
    public static void main(String[] args) {


        int count = 1;
        while(count != 6){
            System.out.println("Conut value is " + count);
            count++;
        }
        System.out.println("---------");

        count = 1;
        while(true){
            if (count == 6){
                break;
            }
            System.out.println("Conut value is " + count);
            count++;
        }

        System.out.println("---------");

        count = 1;
        do {
            System.out.println("Conut value is " + count);
            count++;
        }while(count != 6);






    }

    public static boolean isOdd(int number){
        if ((number > 0) && (number % 2 != 0) ){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start , int end){
        int sum = 0;
        if (start > 0 && end > 0 && end >=start ){
            for (int i = start; i <= end; i++ ){
                if (isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
        return -1;

    }
}
