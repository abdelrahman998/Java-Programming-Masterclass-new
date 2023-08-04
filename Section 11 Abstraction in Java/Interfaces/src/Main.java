import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main   {

    public static void main(String[] args) {


        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        System.out.println("-".repeat(10));

        inFlight(new Jet());
        System.out.println("-".repeat(10));

        Trackable truck = new Truck();
        truck.track();
        System.out.println("-".repeat(10));


        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("the truck traveled %.2f km or %.2f miles%n",
                kmsTraveled, milesTraveled);
        System.out.println("-".repeat(10));

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);


        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);



    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.land();
        }
    }




}
