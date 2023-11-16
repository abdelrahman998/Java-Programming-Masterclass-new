import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItem(groceries);
                case 2 -> removeItem(groceries);
                default -> flag = false;
            } 
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }


    }

    private static void addItem(ArrayList<String> groceries) {

        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for(int i = 0; i < items.length; i++) {
            String trimmed = items[i].trim();
            if (groceries.indexOf(0) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItem(ArrayList<String> groceries) {

        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for(int i = 0; i < items.length; i++) {
            String trimmed = items[i].trim();
                groceries.remove(trimmed);
        }
    }

    private static void printActions() {
        String textblock = """
                Available actions:
                
                0 - to shutdown 
                
                1 - to add items(s) to list (comma delimited list)
                
                2 - to remove any items (coma delimited list)
                
                Enter a number for which action you want to do:""";
        System.out.println(textblock + " ");
    }



}
