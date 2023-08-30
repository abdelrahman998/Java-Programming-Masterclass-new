public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStars(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }
        else {
            for (int i = 0;  i < number; i++){
                for (int j = number; j > number; i--)
            }


        }
    }
    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int rowCount;
            int columnCount;
            int currentRow;
            rowCount = columnCount = number;
            for (int row = 0; row < rowCount; row++) {
                currentRow = row;
                for (int column = 0; column < columnCount; column++) {
                    if (row == 0 || column == 0 || row == rowCount - 1 || column == columnCount - 1 || column == row ||
                            column == (rowCount - currentRow - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

}
