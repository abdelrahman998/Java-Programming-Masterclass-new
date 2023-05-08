import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        Movie movie = new Movie("terminal");
//        movie.watchMovie();
//
//        Movie movie1 = new Adventure("harry Potter");
//        movie1.watchMovie();

//        Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
//        theMovie.watchMovie();


        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q for quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();

        }


    }


    public static double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int j : salary) {
            min = Math.min(min, j);
            max = Math.max(max, j);
        }

        double sum = 0;

        for (int j : salary) {
            if (min != j && max != j) {
                sum += j;
            }
        }
        return sum / (salary.length - 2);
    }

    public int countOdd(int low, int high) {
        int count = 0;
        if (low % 2 == 0) {
            for (int i = low + 1; i <= high; i += 2) {
                count++;
            }
        }
        {
            for (int i = low; i <= high; i += 2) {
                count++;
            }
        }
        return count;
    }


}
