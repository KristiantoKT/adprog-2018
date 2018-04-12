package tallycounter;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTallyCounter {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        //counter++;
        counter.getAndIncrement();
    }

    public void decrement() {
        //counter--;
        counter.getAndDecrement();
    }

    public AtomicInteger value() {
        return counter;
    }
}
