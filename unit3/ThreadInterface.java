package unit3;

public class ThreadInterface implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        ThreadInterface myRunnable = new ThreadInterface();
        Thread thread = new Thread(myRunnable);
        thread.start(); 
    }
}
