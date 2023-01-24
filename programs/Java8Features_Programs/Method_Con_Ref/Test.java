package programs.Java8Features_Programs.Method_Con_Ref;

public class Test {
    public static void main(String[] args) {
        // Using Lambda Expression
        InterfaceDemo4 interfLambda = (name, rollNo, marks, age) -> new Student(name,rollNo,marks,age);
        // Using Method Reference
        InterfaceDemo4 interfRef = Student::new;

        interfLambda.get("Indrajit",01,87,25);
        interfRef.get("Kumar",02,98,25);
    }
}
