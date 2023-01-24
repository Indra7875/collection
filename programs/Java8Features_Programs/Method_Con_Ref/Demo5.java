package programs.Java8Features_Programs.Method_Con_Ref;

public class Demo5 {
    public static void main(String[] args) {
        InterfaceDemo2 interfaceDemo2 = Sample::new;
        interfaceDemo2.get();
        Sample s2 = interfaceDemo2.get();
    }
}
