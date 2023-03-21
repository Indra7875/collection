import java.util.Scanner;

class Guesser {

    int guessedNum;

    public int guessedNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Guesser, Guess the number");
        guessedNum = sc.nextInt();
        return guessedNum;
    }
}

class Player {
    int playerNum;

    public int playerNumber(int p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Player " + p + " , Guess the number");
        playerNum = sc.nextInt();
        return playerNum;
    }
}

class Umpire {
    int guesserNumber;
    int p1Number;
    int p2Number;
    int p3Number;

    public void getNumberFromGuesser() {
        Guesser guesser = new Guesser();
        guesserNumber = guesser.guessedNumber();
    }

    public void getNumberFromPlayers() {
        Player p1 = new Player();
        p1Number = p1.playerNumber(1);

        Player p2 = new Player();
        p2Number = p2.playerNumber(2);

        Player p3 = new Player();
        p3Number = p3.playerNumber(3);
    }

    public String calculateResult() {

        if (guesserNumber == p1Number && guesserNumber == p2Number && guesserNumber == p3Number) {
            return "All Three Player Win !!!";
        } else if (guesserNumber == p1Number && guesserNumber == p2Number) {
            return "Player 1 and Player 2 Win !!";
        } else if (guesserNumber == p1Number && guesserNumber == p3Number) {
            return "Player 1 and Player 3 Win !!";
        } else if (guesserNumber == p2Number && guesserNumber == p3Number) {
            return "Player 2 and Player 3 Win !!";
        } else {
            return guesserNumber == p1Number ? "Player 1 Win !"
                    : guesserNumber == p2Number ? "Player 2 Win !"
                            : guesserNumber == p3Number ? "Player 3 Win !" : "No one win. Restart the GAME";
        }

    }
}

public class LaunchGuesserGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.getNumberFromPlayers();
        String result = umpire.calculateResult();
        System.out.println(result);
    }
}
