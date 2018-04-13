package game;

public class QuizTimer implements Runnable {
    private QuizScore scorer;
    private Thread thread;
    private final int sleepTime = 1000; //equal to 1 second

    public QuizTimer(QuizScore scorer) {
        this.scorer = scorer;
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this, "Quiz Timer");
            thread.start();
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(sleepTime);
                scorer.decrement();
            }
        } catch (InterruptedException e) {
            System.out.println("Quiz Timer interrupted");
        }
        System.out.println("Quiz Timer stopped");
    }
}
