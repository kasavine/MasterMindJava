package mastermind_java;

public class Controller {

    public void startGame(Model game, IView view) {
        view.showStartGame();

        String guess; 

        do {
            guess = view.askNextMove();
            game.currentAttempts += 1;

            if (guess.equals(game.code)) {
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

    public static void main(String[] args) {
        Controller master = new Controller();
        GameView view = new GameView();

        Model game = new Model();

        game.code = "1234";
        game.pieces = "01234567";
        game.attempts = 5;
        game.currentAttempts = 0;

        master.startGame(game, view);
    }
}