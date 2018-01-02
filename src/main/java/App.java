/**
 * Created by Guest on 1/2/18.
 */
import models.PlayGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ready to play Rock, Paper, or Scissor.  What is your Choice?");
        try {
            String userInput = bufferedReader.readLine();
            String results = PlayGame.validResponse(userInput);
            System.out.println(results);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
