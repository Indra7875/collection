package programs.Java8Features_Programs.Method_Con_Ref;

public class Demo4 {
    public static void sum(int a, int b){
        System.out.println("The sum is : "+(a+b));
    }

    public static void main(String[] args) {
        InterfaceDemo1 interfaceDemo1 = (x,y) -> System.out.println("The sum is : "+(x+y));
        interfaceDemo1.add(10,20);

        InterfaceDemo1 interfaceDemo11 = Demo4::sum;
        interfaceDemo11.add(100,200);
    }
}
