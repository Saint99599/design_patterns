public class App {

    public static void main(String[] args) {

        Algorithm footballGame = new Algorithm(new Football());
        footballGame.playGame();

        Algorithm basketballGame = new Algorithm(new Basketball());
        basketballGame.playGame();
    }
}