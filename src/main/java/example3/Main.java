package example3;

// Interface with no parameters and a return type
interface NameProvider {
    String getName();
}

// Interface with no parameters and no return type
interface Greeter {
    void greet();
}

// Interface with parameters and a return type
interface Multiplier {
    int multiply(int a, int b);
}

// Interface with parameters and no return type
interface Printer {
    void print(String message);
}

public class Main {

    public static void main(String[] args) {

        // Example: Interface with parameters and a return type
        Multiplier multiplier = (a, b) -> a * b;
        System.out.println("Product: " + multiplier.multiply(5, 4));

        // Example: Interface with parameters and no return type
        Printer printer = message -> System.out.println("Message: " + message);
        printer.print("Hello, World!");

        // Example: Interface with no parameters and a return type
        NameProvider nameProvider = () -> "John Doe";
        System.out.println("Name: " + nameProvider.getName());

        // Example: Interface with no parameters and no return type
        Greeter greeter = () -> System.out.println("Hello, everyone!");
        greeter.greet();
    }
}
