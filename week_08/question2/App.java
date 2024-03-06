public class App {
    public static void main(String[] args) {
        ScoreManager scoreManager = ScoreManager.getInstance();

        ScoreDisplay display1 = new ScoreDisplay();
        ScoreDisplay display2 = new ScoreDisplay();

        scoreManager.registerObserver(display1);
        scoreManager.registerObserver(display2);

        ScoreInput scoreInput = new ScoreInput(scoreManager);

        // Start input loop
        scoreInput.startInput();
    }
}