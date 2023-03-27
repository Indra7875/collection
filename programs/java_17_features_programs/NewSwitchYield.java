package programs.java_17_features_programs;

public class NewSwitchYield {
    public static void main(String[] args) {
        String month = "Feb";

        int days = switch (month){
            case "Jan" : yield  31;
            case "March" : yield 31;
            case "April" : yield 30;
            case "May" : yield 31;
            case "June" : yield 30;
            case "July" : yield 31;
            case "Aug" : yield 31;
            case "Sept" : yield 30;
            case "Oct" : yield 31;
            case "Nov" : yield 30;
            case "Dec" : yield 31;
            default : yield 29;
        };

        System.out.println(days);
    }
}
