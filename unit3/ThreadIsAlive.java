package unit3;

public class ThreadIsAlive extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadIsAlive t = new ThreadIsAlive();
        System.out.println("is alive: " + t.isAlive());
        t.start();
        System.out.println("is alive: " + t.isAlive());

        System.out.println("thread name: " + t.getName());
        System.out.println("thread priority: " + t.getPriority());
    }
}
