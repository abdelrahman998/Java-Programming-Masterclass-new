import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;

public class NextMain {

    public static void main(String[] args) {


        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Jaws");
        Movie comedyMovie = (Movie) comedy;
        comedyMovie.watchMovie();

        System.out.println("--------");

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var monkey = Adventure.getMovie("A", "Monkey");
        monkey.watchMovie();

        var starWar = Adventure.getMovie("c", "Star War");
        starWar.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("s", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }


    }


}
