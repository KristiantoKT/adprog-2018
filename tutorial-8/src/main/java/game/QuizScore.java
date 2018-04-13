package game;

public class QuizScore {
    private double score = 100;

    public synchronized void increase(double value) {
        score += value;
    }

    public synchronized double value() {
        return score;
    }

    public synchronized void decrement() {
        score--;
    }
}
