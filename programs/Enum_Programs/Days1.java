package programs.Enum_Programs;

enum Days1 {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Defining main method inside enum
    public static void main(String[] args) {
        Days1 day = Days1.FRIDAY;
        System.out.println(day);
    }
}
