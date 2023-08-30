public class Main {
    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString = "+ numberAsString);

        int numberAsIntger = Integer.parseInt(numberAsString);
        System.out.println("numberAsIntger = "+ numberAsIntger);

        numberAsString += 1;
        numberAsIntger +=1;

        System.out.println("numberAsString = "+ numberAsString);
        System.out.println("numberAsIntger = "+ numberAsIntger);



        double numberAsDouble = Double.parseDouble(numberAsString);
        System.out.println("nuberAsDouble = " + numberAsDouble);
    }
}
