import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermanentEmployeeTest {

    private PermanentEmployee employee;

    @BeforeEach
    void setUp(){
        employee = new PermanentEmployee(
                "EMP101",
                "ARUN",
                3000,
                500,
                200
        );
    }

    @Test
    void shouldCalculateGrossSalary(){
        assertEquals(3700.0,employee.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction(){
        assertEquals(370.0,employee.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary(){
        assertEquals(3330.0,employee.calculateNetSalary());
    }


}
