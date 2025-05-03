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
