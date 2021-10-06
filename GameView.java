package mastermind_java;

import java.util.Scanner;

public class GameView implements IView {

    public void showStartGame() {
        System.out.println("|-------------------------------------|");
        System.out.println("|       Starting MASTERMIND game      |");
        System.out.println("|-------------------------------------|");
    }

    public void showState(Model model) {
        int remainingAttempts = model.attempts - model.currentAttempts;
        int wellPlaced = model.countWellPlaced();
        int misPlaced = model.countMisplaced();
        System.out.printf("=> You stil have %d attempt(s) to guess.\n", remainingAttempts);
        System.out.printf("=> Well placed pieces: %d \n", wellPlaced); // are correct and in the correct position
        System.out.printf("=> Misplaced pieces: %d \n", misPlaced); // are correct but in the wrong position
    }

    public String askNextGuess(Model model) {
        System.out.printf("\nAttempt number %d. Type your quess: \n", model.currentAttempts);
        var playersGuess = new Scanner(System.in).next(); // Read user input
        return playersGuess;
    }

    public void showWonState(Model model) {
        System.out.println("=> Your guess is right. Congrats.");
        System.out.printf("=> Code was: %s \n", model.code);
        System.out.printf("=> You used %d attempt(s) \n", model.currentAttempts);
    }

    public void showLostState(Model model) {
        System.out.println("=> No more attempts, you lost.");
        System.out.printf("=> Code was: %s \n", model.code);
    }
}