import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        Movie movie = new Movie("terminal");
//        movie.watchMovie();
//
//        Movie movie1 = new Adventure("harry Potter");
//        movie1.watchMovie();
//
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

    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = length / 2; i >= 1; i--) {
            if (length % i == 0) {
                int m = length / i;
                String subS = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(subS);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }


}
