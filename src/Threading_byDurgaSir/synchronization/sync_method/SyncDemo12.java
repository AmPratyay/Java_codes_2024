package Threading_byDurgaSir.synchronization.sync_method;

public class SyncDemo12 {

    public static void main(String[] args) {

        Displayer d = new Displayer();

        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();
    }
}
