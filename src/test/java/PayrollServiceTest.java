import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PayrollServiceTest {

    private PayrollService payrollService;

    @BeforeEach
    void setUp() {

        Employee employee = new Manager(
                "EMP103",
                "Ravi",
                5000,
                800,
                300,
                1000
        );

        payrollService = new PayrollService(employee);
    }

    @Test
    void shouldProcessPayroll() {

        assertDoesNotThrow(() -> payrollService.processPayroll());
    }

    @Test
    void shouldGeneratePaySlip() {

        assertDoesNotThrow(() -> payrollService.generatePaySlip());
    }
}
