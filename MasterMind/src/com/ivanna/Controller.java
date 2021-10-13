package com.ivanna;

import com.ivanna.views.IView;

public class Controller {

  private Model game;
  private IView view;

  public Controller(Model game, IView view) {
    this.game = game;
    this.view = view;
  }

  public void startGame() {

    view.showStartGame();
    String guess;

    do {
      guess = view.askNextGuess(game);
      game.currentGuess = guess;
      game.currentAttempts += 1;

      if (game.currentGuess.equals(game.code)) {
        view.showWonState(game);
        return;
      }
      if (game.currentAttempts == game.attempts) {
        view.showLostState(game);
        return;
      }
      view.showState(game);
    } while (game.attempts >= game.currentAttempts);
  }
}
