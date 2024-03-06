import java.util.ArrayList;
import java.util.List;

// Singleton ScoreManager
class ScoreManager implements ScoreSubject {
    private static ScoreManager instance;
    private List<ScoreObserver> observers;

    private ScoreManager() {
        observers = new ArrayList<>();
    }

    public static ScoreManager getInstance() {
        if (instance == null) {
            instance = new ScoreManager();
        }
        return instance;
    }

    @Override
    public void registerObserver(ScoreObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ScoreObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String score) {
        for (ScoreObserver observer : observers) {
            observer.update(score);
        }
    }
}
