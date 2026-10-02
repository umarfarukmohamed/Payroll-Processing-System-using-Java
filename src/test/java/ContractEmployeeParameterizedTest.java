import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContractEmployeeParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "3000, 400, 3400",
            "4000, 500, 4500",
            "5000, 1000, 6000"
    })
    void shouldCalculateGrossSalary(double basicSalary,
                                    double contractBonus,
                                    double expectedGrossSalary) {

        ContractEmployee employee = new ContractEmployee(
                "EMP001",
                "Test Employee",
                basicSalary,
                contractBonus
        );

        assertEquals(expectedGrossSalary, employee.calculateGrossSalary());
    }
}
