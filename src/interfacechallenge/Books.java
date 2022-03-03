package interfacechallenge;

import java.util.ArrayList;

public class Books implements ISaveable {
    private ArrayList<String> books = new ArrayList<String>();

    @Override
    public void add(ArrayList items) {
        for (int i = 0; i < items.size(); i++) {
            this.books.add(i, items.get(i).toString());
        }
    }

    @Override
    public ArrayList show() {
        for (int i = 0; i < this.books.size(); i++) {
            System.out.println("Book " + (i + 1) + " is " + this.books.get(i).toString());
        }
        return books;
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + books +
                '}';
    }
//    @Override
//    public String toString() {
//        return books.toString();
//    }
}
