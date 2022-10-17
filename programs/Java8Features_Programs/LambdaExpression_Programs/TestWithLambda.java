package programs.Java8Features_Programs.LambdaExpression_Programs;

public class TestWithLambda {
    public static void main(String[] args) {
        Bank bank = () -> System.out.println("send money amount 10000");
        bank.sendMoney();
    }
}
