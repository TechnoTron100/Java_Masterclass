package reversechallenge;

import java.util.Arrays;

public class RevChallenge {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }

    private static void reverse(int[] integers) {
        int[] sorted = new int[integers.length];
        for (int i = 0; i < integers.length; i++) {

            sorted[i] = integers[i];

        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    flag = true;
                }

            }
        }
        System.out.println("Original " + Arrays.toString(integers));
        System.out.println("Sorted " + Arrays.toString(sorted));
    }
}
