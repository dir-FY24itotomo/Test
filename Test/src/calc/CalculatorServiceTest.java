package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

	@Test
	void testAddAndReport() {
		Calculator calculator = new Calculator();
		CalculatorService calcService = new CalculatorService(calculator);
		assertEquals("Result: 5",calcService.addAndReport(2, 3));
	}

	@Test
	void testSubtractAndReport() {
		Calculator calculator = new Calculator();
		CalculatorService calcService = new CalculatorService(calculator);
		assertEquals("Result: -1",calcService.subtractAndReport(2, 3));
	}

}
