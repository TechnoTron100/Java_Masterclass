package contacts;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> contactRecord;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactRecord = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contacts) {
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("Contact is already on the file");
            return false;
        }
        contactRecord.add(contacts);
        return true;
    }

    private int findContact(Contacts contacts) {
        return this.contactRecord.indexOf(contacts);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < contactRecord.size(); i++) {
            Contacts contacts = this.contactRecord.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Boolean updateContact(Contacts old, Contacts newContact) {
        int foundPodsition = findContact(old);
        if (foundPodsition < 0) {
            System.out.println("Not found");
            return false;
        }
        contactRecord.set(foundPodsition, newContact);
        return true;
    }

    public Boolean removeContact(Contacts contact) {
        int foundPodsition = findContact(contact);
        if (foundPodsition < 0) {
            System.out.println("Not found");
            return false;
        }
        contactRecord.remove(contact);
        System.out.println(contact.getName() + " removed");
        return true;
    }

    public String queryContact(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            return contacts.getPhoneNumber();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.contactRecord.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < contactRecord.size(); i++) {
            System.out.println((i + 1) + ". " + this.contactRecord.get(i).getName() + "=>"
                    + this.contactRecord.get(i).getPhoneNumber());

        }
    }
}
