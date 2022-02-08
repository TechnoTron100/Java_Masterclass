package refvaluetypes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RefValueTypes {
    public static void main(String[] args) {
        int myValue = 10;
        int anotherValue = myValue;
        System.out.println("myValue " + myValue);
        System.out.println("AnotherValue " + anotherValue);

        anotherValue++;
        System.out.println("AnotherValue " + anotherValue);
        System.out.println("myValue " + myValue);

        int[] myArray = new int[5];
        int[] anotherArray = myArray;


        System.out.println("myArray " + Arrays.toString(myArray));
        System.out.println("AnotherArray " + Arrays.toString(anotherArray));

        myArray[0] = 12;
        System.out.println("After change myArray " + Arrays.toString(myArray));
        System.out.println("After change anotherArray " + Arrays.toString(anotherArray));

        anotherArray = new int[]{2, 4, 6, 8};
        modifyArray(myArray);
        System.out.println("After modify change myArray " + Arrays.toString(myArray));
        System.out.println("After modify change anotherArray " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] arr) {
        arr[0] = 2;
        arr = new int[]{1, 2, 3, 4, 5};

        System.out.println("in Modify " + Arrays.toString(arr));
    }
}
