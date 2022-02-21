package linkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Dracula", 120.9);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(12.3);
//        anotherCustomer.setName("Frankenstein");
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
        System.out.println("Balance for customer " + anotherCustomer.getName() + " is " + anotherCustomer.getBalance());


        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(1);
        intlist.add(5);
        intlist.add(8);

        for (int i = 0; i < intlist.size(); i++) {
            System.out.println(i + ": " + intlist.get(i));
        }

        intlist.add(2, 3);
        for (int i = 0; i < intlist.size(); i++) {
            System.out.println(i + ": " + intlist.get(i));
        }
    }


}
