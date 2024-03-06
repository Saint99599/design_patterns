public class App {

	public static void main(String[] args) {
				
		Algorithm Football = new Football();
		Football.initializeGame();
		Football.playingGame();
		Football.ShowResult();
        
		Algorithm Basketball = new Basketball();
		Basketball.initializeGame();
		Basketball.playingGame();
		Basketball.ShowResult();
	}
}