/* Using an interface and concrete implementation classes, the Bridge pattern example decouples the abstraction (Vehicle) from its implementation (Engine).
The constructor of the Car class, which implements the Vehicle interface, accepts an Engine object and assigns the start function to it.
Because of this, the Car class may operate with both gasoline and diesel engines without being inextricably linked to a particular implementation. 
The primary technique creates automobiles with various engines and drives them to show the design's versatility. */

// Abstraction interface
interface Vehicle {
    void drive();
}

// Implementation interface
interface Engine {
    void start();
}

// Concrete implementation classes
class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}

class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }
}

// Refined abstraction class
class Car implements Vehicle {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}

public class StructMain2 {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();

        Vehicle car1 = new Car(petrolEngine);
        Vehicle car2 = new Car(dieselEngine);

        car1.drive();
        car2.drive();
    }
}