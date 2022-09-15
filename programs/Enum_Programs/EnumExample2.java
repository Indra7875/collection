package programs.Enum_Programs;

// Defined enum outside the class 
enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample2 {
    public static void main(String[] args) {
        Days day = Days.MONDAY;
        System.out.println(day);
    }
}
