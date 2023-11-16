import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripleSumToZero {

    public static List<List<Integer>> searchTriples(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> triples = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
        }
        return triples;
    }

    private static void searchPair(int[] arr, int targetSum, int left, List<List<Integer>> triples) {
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == targetSum) {
                triples.add(Arrays.asList(targetSum, arr[left], arr[right]));
                left++;
                right--;

                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }
                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }
            } else if (targetSum > currentSum) {
                left++;
            } else {
                right--;
            }
        }
    }




}
