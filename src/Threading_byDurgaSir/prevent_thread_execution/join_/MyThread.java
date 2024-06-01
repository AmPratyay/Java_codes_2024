package Threading_byDurgaSir.prevent_thread_execution.join_;

public class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Seetha Thread ...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
