package abstraction;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Bird bird = new Parrot("Parrot");
        bird.breathe();
        bird.eat();
        bird.fly();

        Penguin penguin = new Penguin("Madagascar");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
