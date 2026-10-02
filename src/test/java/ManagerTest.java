import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {

    private Manager manager;

    @BeforeEach
    void setUp() {
        manager = new Manager(
                "EMP103",
                "Ravi",
                5000,
                800,
                300,
                1000
        );
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(7100.0, manager.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(852.0, manager.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(6248.0, manager.calculateNetSalary());
    }
}
