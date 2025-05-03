import java.util.HashSet;

public class exercises {

    public static void exercise() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

public class ExerciseII {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result += arr[i];
            } else {
                result -= arr[i];
            }
        }

        System.out.println(result);
    }
}

    public static void exerciseIV() {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        findPairs(arr, target);
    }

    public static void exerciseFive(int[] arr, int target) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        HashSet<String> foundPairs = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seenNumbers.contains(complement)) {
                int smaller = Math.min(num, complement);
                int larger = Math.max(num, complement);
                foundPairs.add("(" + smaller + ", " + larger + ")");
            }
            seenNumbers.add(num);
        }

        if (foundPairs.isEmpty()) {
            System.out.println("No pairs found with the given sum.");
        } else {
            System.out.println("Pairs with sum " + target + ": " + foundPairs);
        }
    }
}
