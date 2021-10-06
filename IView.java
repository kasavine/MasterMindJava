package mastermind_java;

public interface IView {

    public void showStartGame();
    public void showState(Model model);
    public String askNextGuess(Model model);
    public void showWonState(Model model);
    public void showLostState(Model model);
    
}
