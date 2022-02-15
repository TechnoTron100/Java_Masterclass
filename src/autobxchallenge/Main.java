package autobxchallenge;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Bank of Doom");
        bank.addBranch("Catradis");
        bank.addCustomer("Catradis", "Junior", 123.4);
        bank.addCustomer("Catradis", "Jamaica", 193.4);
        bank.addCustomer("Catradis", "Justin", 163.4);

        bank.addBranch("Thundor");
        bank.addCustomer("Thundor", "Bobby", 345.33);
        bank.addCustomer("Thundor", "Thalgis", 567.33);
        bank.addCustomer("Thundor", "Feyd", 901.33);

        bank.listCustomers("Catradis", true);
        bank.listCustomers("Thundor", true);
        if (!bank.addCustomer("Melbourne","Brian",235.112)){
            System.out.println("Error, does not exist");
        }

    }
}
