import java.util.Scanner;

// Subject interface
interface ScoreSubject {
    void registerObserver(ScoreObserver observer);

    void removeObserver(ScoreObserver observer);

    void notifyObservers(String score);
}

// Observer interface
interface ScoreObserver {
    void update(String score);
}

// Concrete Observer ScoreInput
class ScoreInput implements ScoreObserver {
    private ScoreSubject scoreManager;
    private Scanner scanner;

    public ScoreInput(ScoreSubject scoreManager) {
        this.scoreManager = scoreManager;
        this.scanner = new Scanner(System.in);
    }

    public void startInput() {
        while (true) {
            System.out.print("Enter Score (or press Enter to exit): ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                break;
            }

            scoreManager.notifyObservers(input);
        }
    }

    @Override
    public void update(String score) {
        // Do nothing when notified about the score update
    }
}