package models;
import java.util.Random;
/**
 * Created by Guest on 1/2/18.
 */
public class PlayGame {
    public static String validResponse(String playerOne) {
        Random myRandomGenerator = new Random();
        Integer computerTurn = myRandomGenerator.nextInt(3);
        String[] arrayChoice = { "Rock", "Scissor", "Paper" };
        String playerTwo = arrayChoice[computerTurn];
        System.out.println("Computer Goes: " + playerTwo);
        String results = "";
        if (playerOne.equals("Rock") || playerOne.equals("Scissor") || playerOne.equals("Paper") ){
            results = "Valid";
            if (playerOne.equals(playerTwo)) {
                results = "draw";
            } else if (playerOne.equals("Rock") && playerTwo.equals("Paper")) {
                results = "PlayerTwo Wins";
            } else if (playerOne.equals("Rock") && playerTwo.equals("Scissor")) {
                results = "PlayerOne Wins";
            } else if (playerOne.equals("Paper") && playerTwo.equals("Scissor")) {
                results = "PlayerTwo Wins";
            } else if (playerOne.equals("Paper") && playerTwo.equals("Rock")) {
                results = "PlayerOne Wins";
            } else if (playerOne.equals("Scissor") && playerTwo.equals("Paper")) {
                results = "PlayerOne Wins";
            } else if (playerOne.equals("Scissor") && playerTwo.equals("Rock")) {
                results = "PlayerTwo Wins";
            } else {
                results = "Elsed";
            }

        } else {
            results = "This is not a valid choice.";
        }
        return results;

    }
}
