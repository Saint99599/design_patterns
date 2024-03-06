// Concrete Observer ScoreDisplay
class ScoreDisplay implements ScoreObserver {
    private String lastScore;

    @Override
    public void update(String score) {
        lastScore = score;
        System.out.println("live result: Thai " + lastScore + "-0 UAE");
    }
}