package synchro;

public class Counter {
    private int count = 0;

    // Increment the count by 1
    public synchronized void increment() {
        count++;
    }

    // Decrement the count by 1
    public synchronized void decrement() {
        count--;
    }

    // Get the current value of the count
    public synchronized int getCount() {
        return count;
    }
}
