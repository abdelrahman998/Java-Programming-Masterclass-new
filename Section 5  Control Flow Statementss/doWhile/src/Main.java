public class Main {
    public static void main(String[] args) {


        int number =4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while( number <= finishNumber){
            number++ ;
            if (! isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number "+ number);

            evenNumbersFound++;
            if (evenNumbersFound == 5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);


//        int number = 0;
//        while (number < 15) {
//            number++;
//
//            if (number <= 5) {
//                System.out.println("Skipping the number " + number);
//                continue;
//            }
//
//            System.out.println("Number = " + number);
//
//            if (number >= 10) {
//                System.out.println("Breaking at " + number);
//                break;
//            }
//        }


    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
