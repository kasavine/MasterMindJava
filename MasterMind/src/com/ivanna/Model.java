package com.ivanna;

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
    // code = 1234
    // currentGuess = 1345

    // countWellPlaced - 1
    // hash set code - from 0 to 7 - keys
    // {}
  }
}