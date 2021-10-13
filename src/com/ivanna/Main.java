package com.ivanna;

import com.ivanna.views.GameView;
import com.ivanna.views.GameViewWithHeartsHeader;

public class Main {

    public static void main(String[] args) {

        GameView view = new GameViewWithHeartsHeader();
        Model game = new Model();
        Controller master = new Controller(game, view);

//        master.view = null;

        game.code = "1234";
        game.pieces = "01234567";
        game.attempts = 5;
        game.currentAttempts = 0;
        game.currentGuess = "";

        master.startGame();
    }
}
