package Lists;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %S in %s", count, name.toUpperCase(), type);
    }

}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("yogurt");

        ArrayList<GroceryItem> grocerList = new ArrayList<>();
        grocerList.add(new GroceryItem("Butter"));
        grocerList.add(new GroceryItem("milk"));
        grocerList.add(new GroceryItem("oranges", "PRODUCE", 5));
        grocerList.set(0, new GroceryItem("apples", "PRODUCE", 6));
        grocerList.remove(1);
        System.out.println(grocerList);
        System.out.println(grocerList.getClass().getSimpleName());

    }
}
