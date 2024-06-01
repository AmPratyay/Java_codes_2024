package Threading_byDurgaSir.prevent_thread_execution.join_;

public class MyThreadChild extends Thread {

    public static Thread mt;

    public void run() {
        try {
            mt.join(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread ...");
        }
    }
}
