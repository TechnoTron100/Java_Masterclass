package abstraction;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Does not fly. You could say it is an aquatic bird");
    }
}
