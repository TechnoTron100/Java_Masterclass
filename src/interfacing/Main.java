package interfacing;

public class Main {
    public static void main(String[] args) {
        ITelephone jakesPhone;
        jakesPhone = new DeskPhone(45749618);
        jakesPhone.powerOn();
        jakesPhone.callPhone(45749618);
        jakesPhone.answer();
        jakesPhone.dial(45749618);
        jakesPhone.isRinging();

        jakesPhone = new MobilePhone(234556);
        jakesPhone.powerOn();
        jakesPhone.callPhone(23456);
        jakesPhone.isRinging();
        jakesPhone.dial(2341);
        jakesPhone.answer();
    }
}
