package minimumchallenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumChallenge {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count");
        int count = scanner.nextInt();
        int[] readArr = readIntergers(count);

        System.out.println("The array values are " + Arrays.toString(readArr));
        System.out.println("The Minimum value is " + findMin(readArr));

    }

    private static int[] readIntergers(int count) {

        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter number " + (i + 1));
            int input = scanner.nextInt();
            arr[i] += input;
        }
        return arr;
    }

    private static int findMin(int[] arr) {
        int minVal = Arrays.stream(arr).min().getAsInt();
        return minVal;
    }
}
