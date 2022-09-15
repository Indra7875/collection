package programs.Enum_Programs;

public class Example5 {
    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Days day = Days.FRIDAY;
        switch (day) {
            case SUNDAY:
                System.out.println("Today is SUNDAY");
                break;
            case MONDAY:
                System.out.println("Today is MONDAY");
                break;
            case TUESDAY:
                System.out.println("Today is TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("Today is WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("Today is THURSDAY");
                break;
            case FRIDAY:
                System.out.println("Today is FRIDAY");
                break;
            case SATURDAY:
                System.out.println("Today is SATURDAY");
                break;
            default:
                System.out.println("Wrong DAY");
        }

    }
}
