package comparable.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Engine {
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}

class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}

public class ComparatorExample2 {
    public static void main(String[] args) {
        // Create some Engine objects
        Engine engine1 = new Engine("Gasoline", 200);
        Engine engine2 = new Engine("Diesel", 250);
        Engine engine3 = new Engine("Electric", 150);

        // Create some Car objects with engines
        Car car1 = new Car("Toyota", "Camry", engine1);
        Car car2 = new Car("Ford", "F-150", engine2);
        Car car3 = new Car("Tesla", "Model 3", engine3);

        // Create a list of Car objects
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        // Print the list before sorting
        System.out.println("Before sorting:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Sort the list based on engine horsepower using a lambda expression
       // cars.sort(Comparator.comparing((Car car) -> car.getEngine().getHorsepower()).reversed());
        cars.sort(Comparator.comparing((Car car) -> car.getEngine().getType()));
        cars.sort(Comparator.comparing((Car car) -> car.getEngine().getType()));

      //  cars.sort(Comparator.comparing((Car car) -> car.getEngine().getHorsepower()).reversed());

        // Print the list after sorting
        System.out.println("\nAfter sorting by engine horsepower:");

        cars.forEach(System.out::println);

    }
}

