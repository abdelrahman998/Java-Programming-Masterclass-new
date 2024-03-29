public class NomberOfDaysInMonth {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year){
        if(year < 1 && year > 9999){
            return false;
        } else if((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999)|| year % 400 == 0 && (year >= 1 && year <= 9999)){
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int noOfDays = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10 : case 12:
                noOfDays = 31;
                break;
            case 2:
                if(isLeapYear(year)) {
                    noOfDays = 29;
                    break;
                }
                noOfDays = 28;
                break;
            case 4: case 6: case 9 : case 11:
                noOfDays = 30;
                break;
            default:
                noOfDays = -1;
                break;

        }
        return noOfDays;

    }
}

