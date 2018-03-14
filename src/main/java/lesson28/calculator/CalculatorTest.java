
/**
 * 
 */
package lesson28.calculator;

/**
 * @author Alexander Neznaev
 *
 */
public class CalculatorTest {
    public static String test (CalculatorModel calc) {
	calc.clear();
	calc.enterDigit(9);
	calc.enterDigit('.');
	calc.enterDigit(1);
	calc.divide();
	calc.enterDigit(0);
	calc.plus();
	calc.clear();
	calc.enterDigit(2);
	calc.enterDigit(3);
	calc.minus();
	return calc.toString();
    }
    
    public static String test2 (CalculatorModel calc) {
	calc.clear();
	calc.enterDigit(9);
	calc.multiply();
	calc.enterDigit('.');
	calc.enterDigit('.');
	calc.plus();
	return calc.toString();
    }
    
    public static String test3 (CalculatorModel calc) {
	calc.clear();
	calc.enterDigit(9);
	calc.multiply();
	calc.plusMinus();
	//calc.enterDigit(10);
	calc.minus();
	return calc.toString();
    }
    
    public static String test4 (CalculatorModel calc) {
	calc.clear();
	calc.enterDigit(9);
	calc.plus();
	calc.enterDigit(6);
	calc.plus();
	calc.enterDigit(25);
	calc.sqrt();
	calc.minus();
	return calc.toString();
    }
    
    public static String test5 (CalculatorModel calc) {
	calc.clear();
	calc.enterDigit(9);
	calc.memorySave();
	calc.plus();
	calc.enterDigit(2);
	calc.enterDigit('.');
	calc.enterDigit(5);
	calc.deleteLastEnteredDigit();
	calc.minus();
	calc.memoryRestore();
	calc.minus();
	return calc.toString();
    }
    
    public static String test6 (CalculatorModel calc) {
	calc.clear();
	calc.enterDigit(9);
	calc.plus();
	calc.enterDigit(11);
	calc.minus();
	calc.enterDigit(10);
	calc.inverseNumber();
	calc.plus();
	return calc.toString();
    }
}
