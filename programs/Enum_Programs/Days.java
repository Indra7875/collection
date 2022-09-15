package programs.Enum_Programs;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Defining main method inside enum
    public static void main(String[] args) {
        Days day = Days.FRIDAY;
        System.out.println(day);
    }
}
