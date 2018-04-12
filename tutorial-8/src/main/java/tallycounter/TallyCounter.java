package tallycounter;

public class TallyCounter {
    private int counter = 0;

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public int value() {
        return counter;
    }
}
