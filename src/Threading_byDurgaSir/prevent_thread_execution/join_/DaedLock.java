package Threading_byDurgaSir.prevent_thread_execution.join_;

public class DaedLock {

    public static void main(String[] args) throws InterruptedException {

        // Main Thread waiting for Main thread to complete is called deadlock situation
        Thread.currentThread().join();

        System.out.println("I am main thread !");
    }
}
