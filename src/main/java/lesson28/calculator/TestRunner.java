/**
 * 
 */
package lesson28.calculator;

/**
 * @author Alexander Neznaev
 *
 */
public class TestRunner {

    /**
     * @param args
     */
    public static void main(String[] args) {
	CalculatorModel calc = new MyCalc(); // = new ???
	
	String result = CalculatorTest.test(calc);
	System.out.println("test1: " +  result);
	
	String result2 = CalculatorTest.test2(calc);
	System.out.println("test2: " + result2);
	
	String result3 = CalculatorTest.test3(calc);
	System.out.println("test3: " + result3);
	
	String result4 = CalculatorTest.test4(calc);
	System.out.println("test4: " + result4);
	
	String result5 = CalculatorTest.test5(calc);
	System.out.println("test5: " + result5);
	
	String result6 = CalculatorTest.test6(calc);
	System.out.println("test6: " + result6);
    }
}
