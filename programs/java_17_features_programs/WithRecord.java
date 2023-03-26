package programs.java_17_features_programs;

record Student1(int id, String name){
    
}

public class WithRecord {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "Indrajit");
        System.out.println(s1.id()); // print id using id()
        System.out.println(s1.name()); // print name using name()

        System.out.println(s1); // print object data using toString()

        // create obj having same data
        Student1 s2 = new Student1(1, "Indrajit");
        System.out.println(s1.id()); // print id using id()
        System.out.println(s1.name()); // print name using name()

        System.out.println(s2); // print object data using toString()

        System.out.println(s1.equals(s2)); // compare the value inside obj using equals() and hashCode()
    }
}
