package mastermind_java;

public class Model {

    public String code;
    public String pieces;
    public int attempts;
    public int currentAttempts;
    public String currentGuess;

    public int countWellPlaced() {
        int count = 0;
        int i = 0;
        while (i < code.length()) {
            if (code.toCharArray()[i] == (currentGuess.toCharArray()[i]))
                count++;
            i++;
        }
        return count;
    }

    public int countMisplaced() {
        return 999;
    }
}