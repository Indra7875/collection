package programs.Enum_Programs;

public class EnumExample1 {

    // defining the enum inside the class
    public enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }
}
