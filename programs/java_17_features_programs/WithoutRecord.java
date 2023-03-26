package programs.java_17_features_programs;

class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }

}

public class WithoutRecord {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Indrajit");
        System.out.println(s1.getId()); // print Id using getId()
        System.out.println(s1.getName()); // print name using getName()

        System.out.println(s1); // print object data using toString()

        // create obj having same data
        Student s2 = new Student(1, "Indrajit");
        System.out.println(s2.getId()); // print Id using getId()
        System.out.println(s2.getName()); // print name using getName()

        System.out.println(s2); // print object data using toString()

        System.out.println(s1.equals(s2)); // compare the value inside obj using equals() and hashCode()
    }

}
