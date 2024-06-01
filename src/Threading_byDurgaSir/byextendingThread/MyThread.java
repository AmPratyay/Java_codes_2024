package Threading_byDurgaSir.byextendingThread;

public class MyThread extends Thread {

    public void start(){
        super.start();
        System.out.println("Start method");
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}
