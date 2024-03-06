public class Algorithm {
	
	private GameStrategy gameStrategy;

    public Algorithm(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void playGame() {
        gameStrategy.initializeGame();
        gameStrategy.playingGame();
        gameStrategy.showResult();
    }
}