package abstraction;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in and out");
    }

    @Override
    public void fly(){
        System.out.println("Fly like an eagle, to the sea");
    }
}
