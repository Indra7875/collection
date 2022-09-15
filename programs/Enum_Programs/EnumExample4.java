package programs.Enum_Programs;

public class EnumExample4 {
    enum Days {
        SUNDAY(10), MONDAY(20), TUESDAY(30), WEDNESDAY(40), THURSDAY(50),
        FRIDAY(60), SATURDAY(70);

        private int value;

        private Days(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.println(day + " " + day.value);
        }
    }

}
