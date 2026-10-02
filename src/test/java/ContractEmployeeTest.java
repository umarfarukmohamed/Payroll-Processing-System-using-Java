import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContractEmployeeTest {

    private ContractEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new ContractEmployee(
                "EMP102",
                "Kumar",
                3000,
                400
        );
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(3400.0, employee.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(170.0, employee.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(3230.0, employee.calculateNetSalary());
    }
}
