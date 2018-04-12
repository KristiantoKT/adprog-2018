package tallycounter;

public class TallyCounterChecker implements Runnable {

    private TallyCounter tallyCounterReference;
    private Thread thread;
    private int sleepTime;

    public TallyCounterChecker(TallyCounter tallyCounterReference, int sleepTime) {
        this.tallyCounterReference = tallyCounterReference;
        this.sleepTime = sleepTime;
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this, "Tally Counter Checker");
            thread.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Running " + "Tally Counter Checker");
        try {
            for (int i = 65; i > 0; i++) {
                System.out.println("Total Ticket ordered in Tally Counter Is : "
                        + tallyCounterReference.value());
                Thread.sleep(sleepTime);
            }
        } catch (InterruptedException e) {
            System.out.println("Tally Counter Checker interrupted.");
        }
        System.out.println("Tally Counter Checker closed.");
    }
}
