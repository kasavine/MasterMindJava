package mastermind_java;

import java.util.Scanner;

public class GameView implements IView {

    public void showStartGame() {
        System.out.println("|--------------------------|");
        System.out.println("| Starting MASTERMIND game |");
        System.out.println("|--------------------------|");
    }

    public void showState(Model model) {
        int remaining = model.attempts - model.currentAttempts;
        System.out.println("|-------------------------------------|");
        System.out.printf("| You stil have %d attempt(s) to guess.|\n", remaining);
        System.out.println("|-------------------------------------|");

    }

    public String askNextMove() {
        System.out.println("\nType your quess:");
        var playersGuess = new Scanner(System.in).next(); // Read user input
        return playersGuess;
    }

    public void showWonState(Model model) {
        System.out.println("|--------------------------------|");
        System.out.println("| Your guess is right. Congrats. |");
        System.out.printf("| Code was: %s                 |\n", model.code);
        System.out.printf("| You used %d attempt(s)          |\n", model.currentAttempts);
        System.out.println("|--------------------------------|");
    }

    public void showLostState(Model model) {
        System.out.println("|-------------------------------|");
        System.out.println("| No more attempts, you lost.   |");
        System.out.printf("| Code was: %s                |\n", model.code);
        System.out.println("|-------------------------------|");
    }
}