package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Box {
    private int height;
    private int weight;

    public Box(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}

public class Example8 {
    public static void main(String[] args) {
        // Create a list of Box objects
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(5, 10));
        boxes.add(new Box(5, 10));
        boxes.add(new Box(5, 12));
        boxes.add(new Box(3, 15));
        boxes.add(new Box(5, 5));
        boxes.add(new Box(4, 20));

        // Sort the list of boxes using a custom comparator
        boxes.sort(Comparator.comparing(Box::getHeight).thenComparing(Box::getWeight));

        // Print the sorted list of boxes
        System.out.println("Sorted list of boxes:");
        boxes.forEach(System.out::println);
    }
}

