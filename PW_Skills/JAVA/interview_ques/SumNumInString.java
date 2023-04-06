package interview_ques;

// Que. Sum the numbers in given string
public class SumNumInString {
    public static void main(String[] args) {
        String str = "asre123ft34gt23yu45";

      int sum =  str.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
        System.out.println(sum);

      int sumEven = str.chars().filter(Character::isDigit).map(Character::getNumericValue).filter(i -> i%2==0).sum();
        System.out.println(sumEven);
    }
}
