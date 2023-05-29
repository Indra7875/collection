package programs.Java8Features_Programs.JavaTechie;

interface Calculator1{
    void switchOn();

}

interface Sum{
    void sum(int a, int b);
}

interface Subtract {
    int subtract(int a, int b);
}

interface FindGreaterValue{
    void greater(int a, int b);
}

public class CalculatorImpl_Lambda {
    public static void main(String[] args) {
        Calculator1 calculator1 = () -> System.out.println("SwitchOn()");
        calculator1.switchOn();

        Sum sum = (a,b) ->System.out.println("Sum is : "+(a+b));
        sum.sum(10,20);

        Subtract sub = (a,b) -> a-b;
        System.out.println(sub.subtract(30,5));

        FindGreaterValue value = (a,b) -> {
          if (a > b)
              System.out.println("Value "+a+" is grater");
          else if (a < b)
              System.out.println("Value "+b+" is grater");
          else
              System.out.println("Both values are equal "+a+" "+b);
        };

        value.greater(40,80);
    }
}
