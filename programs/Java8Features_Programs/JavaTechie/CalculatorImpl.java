package programs.Java8Features_Programs.JavaTechie;

interface Calculator{
    void switchOn();
}
public class CalculatorImpl implements Calculator{

    @Override
    public void switchOn() {
        System.out.println("switchOn()");
    }

    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.switchOn();
    }
}
