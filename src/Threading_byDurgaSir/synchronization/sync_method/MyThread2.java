package Threading_byDurgaSir.synchronization.sync_method;

public class MyThread2 extends Thread {

    Displayer d;

    public MyThread2(Displayer d) {
        this.d = d;
    }

    public void run() {
        d.displayc();
    }
}
