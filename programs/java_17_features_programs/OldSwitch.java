package programs.java_17_features_programs;

public class OldSwitch {
    public static void main(String[] args) {

        String day = "Sunday";

        switch (day){
            case "Saturday", "Sunday" :
                System.out.println("6 AM");
                break;
            case "Monday" :
                System.out.println("8 AM");
                break;
            default:
                System.out.println("7 AM");
        }
    }
}
