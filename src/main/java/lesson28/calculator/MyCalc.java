/**
 * 
 */
package lesson28.calculator;

/**
 * @author Alexander Neznaev
 * @see CalculatorModel
 */
public class MyCalc implements CalculatorModel {

    private String history = new String();
    
    private double memory = 0;

    private String screen = new String();
    // lastOperatorToApply
    private char operator = 0;
    // lastResultInMemory - число,которое вводилось до текущего числа или
    // является результатом прошлой операции
    private double lastRes = 0;
    // currentNumber
    private String current = "0";

    private void doOperation (char operation) {
	current = "" + Double.parseDouble(current);
	if (history.length() != 0 && history.charAt(history.length() - 1) == ')') {
	    history += operation;
	} else {
	    history += current + operation;
	}
	if (operator != '0') {
	    lastRes = applyLastOperation();
	    screen = "" + lastRes;
	} else {
	    lastRes = Double.parseDouble(current);
	}
	operator = operation;
	current = "0";
    }
    
    private Double applyLastOperation() {
	switch (operator) {
	case '+':
	    return lastRes + Double.parseDouble(current);
	case '-':
	    return lastRes - Double.parseDouble(current);
	case '*':
	    return lastRes * Double.parseDouble(current);
	case '/':
	    return lastRes / Double.parseDouble(current);
	case 's':
	    return lastRes / Double.parseDouble(current);
	default:
	    break;
	}
	return lastRes;
    }

    /* 
     * 
     */
    @Override
    public void plus() {
	doOperation ('+');
    }

    /* 
     * 
     */
    @Override
    public void minus() {
	doOperation ('-');
    }

    /* 
     * 
     */
    @Override
    public void multiply() {
	doOperation ('*');
    }

    /* 
     * 
     */
    @Override
    public void divide() {
	doOperation ('/');
    }

    /* 
     * 
     */
    @Override
    public void plusMinus() {
	if (!"0".equals(screen)) {
	    if (!"0".equals(current)) {
		current = "-" + current;
	    } else {
		current = "-" + lastRes;
	    }
	}
    }

    /* 
     * 
     */
    @Override
    public void inverseNumber() {
	history += "(1/" + current + ")";
	current = "" + 1 / (Double.parseDouble(current));
	screen = "" + 1 / (Double.parseDouble(current));
    }

    /* 
     * 
     */
    @Override
    public void equalsNow() {
	if (operator != '0') {
	    if ("0".equals(current)) {
		current = "" + lastRes;
	    }
	    lastRes = applyLastOperation();
	    screen = "" + lastRes;
	}
	history = "";
	operator = '0';
	current = "0";
    }

    /* 
     * 
     */
    @Override
    public void percent() {
	history += "(" + current + "";
	current = "" + 1 / (Double.parseDouble(current));
	screen = "" + 1 / (Double.parseDouble(current));
    }

    /* 
     * 
     */
    @Override
    public void sqrt() {
	history += "sqrt(" + current + ")";
	current = "" + Math.sqrt(Double.parseDouble(current));
	screen = "" + Math.sqrt(Double.parseDouble(current));
    }

    /* 
     * 
     */
    @Override
    public void enterDigit(char digit) {
	// особый случай если до этого была нажата кнопка "инверсия знака"
	if (Double.parseDouble(current) == lastRes * -1) {
	    current = "0" + digit;
	    // нельзя добавить две точки подряд
	} else if (current.contains(".")) {
	    return;
	} else {
	    current = current + digit;
	}
    }

    /* 
     * 
     */
    @Override
    public void enterDigit(int digit) {
	// особый случай если до этого была нажата кнопка "инверсия знака" или
	// это первый символ
	if ("0".equals(current) || Double.parseDouble(current) == lastRes * -1) {
	    current = "" + digit;
	} else {
	    current += digit;
	}

	screen = "0".equals(screen) ? "" + digit : screen + digit;
    }

    /* 
     * 
     */
    @Override
    public void clear() {
	history = "";
	screen = "0";
	lastRes = 0;
	current = "0";
	operator = '0';
    }

    /* 
     * 
     */
    @Override
    public void clearError() {
	// TODO Auto-generated method stub

    }

    /* 
     * 
     */
    @Override
    public void deleteLastEnteredDigit() {
	current = current.substring(0, current.length() - 1);
    }

    /* 
     * 
     */
    @Override
    public void memoryRestore() {
	current = "" + memory;
    }

    /* 
     * 
     */
    @Override
    public void memorySave() {
	memory = Double.parseDouble(current);
    }

    /* 
     * 
     */
    @Override
    public void memoryClear() {
	memory = 0;
    }

    /* 
     * 
     */
    @Override
    public double calculateExpression(String exp) {
	// TODO Auto-generated method stub
	return 0;
    }

    /* 
     * 
     */
    @Override
    public double callJavaMath(String methodName, Object[] args) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public String toString() {
	return history + "\n" + ("Infinity".equals(screen) ? "Деление на ноль невозможно" : screen);
    }
}
