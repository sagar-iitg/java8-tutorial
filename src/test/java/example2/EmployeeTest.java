package example2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testCountEmployeesByCity() {
        // Arrange
        List<Employee> employees = Arrays.asList(
                new Employee(1, "sk", "delhi"),
                new Employee(2, "mohit", "kolkata"),
                new Employee(3, "ankit", "pune"),
                new Employee(4, "ajit", "delhi"),
                new Employee(5, "mahesh", "delhi"),
                new Employee(6, "manu", "bangalore"),
                new Employee(7, "nitin", "bangalore")
        );

        // Act
        Map<String, Long> result = Employee.countEmployeesByCity(employees);

        // Assert
        assertEquals(3L, result.get("delhi"));
        assertEquals(1L, result.get("kolkata"));
        assertEquals(1L, result.get("pune"));
        assertEquals(2L, result.get("banaglore"));
    }
}
