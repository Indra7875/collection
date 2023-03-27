package programs.java_17_features_programs;

public class NewSwitchReturn {
    public static void main(String[] args) {
        String month = "April";

       int days = switch (month){
            case "Jan" -> 31;
            case "March" -> 31;
            case "April" -> 30;
            case "May" -> 31;
            case "June" -> 30;
            case "July" -> 31;
            case "Aug" -> 31;
            case "Sept" -> 30;
            case "Oct" -> 31;
            case "Nov" -> 30;
            case "Dec" -> 31;
            default -> 29;
        };

        System.out.println(days);
    }
}
