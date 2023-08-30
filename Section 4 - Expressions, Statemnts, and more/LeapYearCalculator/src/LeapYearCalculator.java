public class LeapYearCalculator {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(10,12);
        calcFeetAndInchesToCentimeters(-1,-1);
        calcFeetAndInchesToCentimeters(100);
        System.out.println("----------------------------------");
        sum(12,20);
        sum(12,20,10);

        sum(12,20,10,20);
        System.out.println("-----------------------------------");


        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet <0) || ((inches <0) || (inches >12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0 ){
            System.out.println("Invalid value");
            return -1;
        }
        double feet = (int) (inches / 12 );
        double remainingInches = (int) (inches % 12);
        System.out.println(inches + "inches = " +  feet + " feet and "+ remainingInches + "inches");
        return calcFeetAndInchesToCentimeters(feet , remainingInches);

    }

    public static double sum(double num1 , double num2){
        double sum = num1 + num2 ;
        System.out.println("summation ia equal to "+ sum);
        return sum;

    }
    public static double sum(double num1 , double num2 , double num3){
        double sum = num1 + num2 + num3  ;
        System.out.println("summation ia equal to "+ sum);
        return sum;
    }
    public static double sum(double num1 , double num2, double num3 , double num4){
        double sum = num1 + num2 + num3 + num4;
        System.out.println("summation ia equal to "+ sum);
        return sum;
    }

///////////////////////////////////////////////

    private static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds <0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString =  seconds+ "s";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + " " +minutesString + " " + secondsString ;
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }





}
