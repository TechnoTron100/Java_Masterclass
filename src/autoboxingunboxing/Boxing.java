package autoboxingunboxing;


import java.util.ArrayList;

public class Boxing {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i = 0; i < intArrayList.size(); i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(i + " ====> " + intArrayList.get(i).intValue());
        }

        Integer myinteger = 54;
        int myint = myinteger;

        ArrayList<Double> myDouble = new ArrayList<Double>();
        for (double i = 0; i <= 10.0; i += 0.5) {
            myDouble.add(Double.valueOf(i));
        }

        for (int i = 0; i < myDouble.size(); i++) {
            double value = myDouble.get(i).doubleValue();
            System.out.println(i + " ===> " + value);
        }
    }

}
