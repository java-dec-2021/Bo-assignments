

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOperandOne(10.5);
        c.setOperandTwo(5.2);
        c.setOperation('+');
        c.performOperation();
        c.getResults();
    }
}