public class FlourPackProblem {
    public static void main(String[] args) {

    }

    public static boolean canPack(int bigCount, int samllCount, int goal) {
        if (bigCount < 0 || samllCount < 0 || goal < 0) {
            return false;
        }
        else{

            int bigCountTotal = bigCount *5;
            int totalKilos = bigCountTotal + samllCount;

            if (totalKilos == goal ){
                return true;
            }
            else if (bigCountTotal % goal != 0 ) {
                while(bigCountTotal > goal ){
                    bigCountTotal - 5;
                }
            }

        }
    }

}
