package interfacing;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging, isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone turned on!");
    }

    @Override
    public void dial(int phoneNumber) {
        if (!isOn) {
            System.out.println("Ringing " + phoneNumber + " on mobile");
        } else {
            System.out.println("The mobile number you are trying to call is currently switched off. Please try again later, thank you.");
        }
    }

    @Override
    public void answer() {
        System.out.println("Answering mobile phone");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && !isOn) {
            System.out.println("Melody ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
