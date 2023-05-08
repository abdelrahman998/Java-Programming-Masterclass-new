package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};


        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(List.of("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);


        String[] groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));


        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));
        System.out.println("---------------------------------");

        originalList.sort(Comparator.naturalOrder());
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));
        System.out.println("---------------------------------");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
        String[] stringArray = stringLists.toArray(new String[0]);

        System.out.println(stringLists);
        System.out.println(Arrays.toString(stringArray));


    }

}
