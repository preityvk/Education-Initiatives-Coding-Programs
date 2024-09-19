/*The below program is a use case for Structural patterns
The adapter pattern does not explicitly implement the Bird interface, it does construct an adapter class called DuckAdapter that enables a duck object to be handled as a bird.
Integrating incompatible systems or interfaces can benefit from this. The fly and makeSound functions are delegated to the duck instance via the DuckAdapter class, which in the example implements the Bird interface and includes a Duck object. */

// Target interface
interface Bird {
    void fly();
    void makeSound();
}

// Adaptee class
class Duck {
    public void quack() {
        System.out.println("Quack!");
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}

// Adapter class
class DuckAdapter implements Bird {
    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void makeSound() {
        duck.quack();
    }
}

public class StructMain1 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Bird bird = new DuckAdapter(duck);

        bird.fly();
        bird.makeSound();
    }
}