package linkedList;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> booksToRead = new LinkedList<String>();
        addInOrder(booksToRead, "Dune");
        addInOrder(booksToRead, "On China");
        addInOrder(booksToRead, "The Foundation");
        addInOrder(booksToRead, "Blink");
        addInOrder(booksToRead, "The End of Power");
        addInOrder(booksToRead, "Throne of Glass");
        printList(booksToRead);

        addInOrder(booksToRead, "Matarese Circle");
        addInOrder(booksToRead, "Dune");
        printList(booksToRead);
        read(booksToRead);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now reading " + i.next());
        }
        System.out.println("========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newBook) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newBook);
            if (comparison == 0) {
                //Equal, do not add
                System.out.println(newBook + " is already in the reading list");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newBook);
                return true;
            } else if (comparison < 0) {
                //move to next book
            }
        }
        stringListIterator.add(newBook);
        return true;
    }

    private static void read(LinkedList books) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = books.listIterator();

        if (books.isEmpty()) {
            System.out.println("No books in the itenerary");
        } else {
            System.out.println("Now reading " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now reading " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now reading " + listIterator.previous());
                    } else {
                        System.out.println("We are at the beginning of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress ");
        System.out.println("0 - to quite\n" + "1 - go to next city\n" + "2 - go to previous city\n" + "3 - print menu options");
    }
}
