package contact;

import java.util.ArrayList;

public class Contacts {
    ArrayList<String> contacts = new ArrayList<String>();

    public void addContacts(String name) {
        contacts.add(name);
        System.out.println(name + " added to the contact list successfully");

    }

    public void modifyContact(int position, String name) {
        contacts.set(position, name);
        System.out.println("Contact " + (position + 1) + " has been modified");
    }

    public void removeContact(int position) {
        contacts.remove(position);
    }

    public String searchContact(String searchText) {
        int position = contacts.indexOf(searchText);
        if (position >= 0) {
            return contacts.get(position);
        }
        return null;
    }

    public void viewContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + " " + contacts.get(i));

        }
    }
}
