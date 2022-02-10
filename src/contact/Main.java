package contact;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Contacts contacts = new Contacts();

    public static void main(String[] args) {

        boolean flag = false;
        int inst;
        printInstructions();
        while (!flag) {
            System.out.println("Enter your choice");
            inst = scanner.nextInt();
            scanner.nextLine();

            switch (inst) {

                case 0:
                    printInstructions();
                case 1:
                    viewContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\t 1 - To view contacts");
        System.out.println("\t 2 - To add contact");
        System.out.println("\t 3 - To modify contact");
        System.out.println("\t 4 - To delete contact");
        System.out.println("\t 5 - To Search contact");
        System.out.println("\t 6 - To quit");


    }

    private static void searchContact() {
        System.out.println("Enter name to search");
        String searchName = scanner.nextLine();
        contacts.searchContact(searchName);
    }

    private static void deleteContact() {
        System.out.println("Enter position to delete:");
        int position = scanner.nextInt();
        contacts.removeContact(position - 1);
    }

    private static void modifyContact() {
        System.out.println("Enter item position");
        int pos = scanner.nextInt();
        System.out.println("Enter new name:");
        String name = scanner.nextLine();
        contacts.modifyContact(pos - 1, name);
    }

    private static void addContact() {
        System.out.println("Enter name to add:");
        contacts.addContacts(scanner.nextLine());
    }


    private static void viewContacts() {
        contacts.viewContacts();
    }
}
