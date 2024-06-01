package Threading_byDurgaSir.prevent_thread_execution.thread_intruption;

public class MyThreading extends Thread {


    public void run() {
        try {

            for (int i = 0; i < 10; i++) {
                System.out.println("I am lazy thread ");
                if (i == 5) {
                    Thread.sleep(2000);
                }
            }
        } catch (Exception e) {
            System.out.println("I got Interrupted");
        }
    }
}
