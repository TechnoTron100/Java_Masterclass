package contacts;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mb = new MobilePhone("08145749618");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action to show available actions: (6 to show available actions");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\n Shutting down");
                    quit = true;
                    break;

                case 1:
                    mb.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void removeContact() {
        System.out.println("Enter an existing contact name");
        String name = sc.nextLine();
        Contacts record = mb.queryContact(name);
        if (mb.removeContact(record)) {
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Error deleting the contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name");
        String name = sc.nextLine();
        Contacts existingContact = mb.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name " + existingContact.getName() + " phoneNumber is "
                + existingContact.getPhoneNumber());
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name");
        String name = sc.nextLine();
        Contacts existingContact = mb.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = sc.nextLine();
        System.out.println("Enter new phone number: ");
        String newnumber = sc.nextLine();
        Contacts newContacts = Contacts.createContact(newName, newnumber);
        if (mb.updateContact(existingContact, newContacts)) {
            System.out.println("Updated successfully ");
        } else {
            System.out.println("Error updating record");
        }


    }

    private static void addNewContact() {
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the number: ");
        String phoneNumber = sc.nextLine();
        Contacts contacts = Contacts.createContact(name, phoneNumber);
        if (mb.addNewContact(contacts)) {
            System.out.println("Contact added: name = " + name + ", Phone number = " + phoneNumber);
        } else {
            System.out.println("Cannot add name = " + name + ", phone number = " + phoneNumber);
        }

    }

    private static void printActions() {
        System.out.println("\n Available actions: \npress");
        System.out.println("0 - To shutdown\n"
                + "1 - To print contacts\n"
                + "2 - To Add a new contact\n"
                + "3 - To Update a contact\n"
                + "4 - To remove a contact\n"
                + "5 - Query if contact exists\n"
                + "6 - to print a list of available actions");
        System.out.println("Choose action: ");
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }
}
