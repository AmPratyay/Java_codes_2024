package Threading_byDurgaSir.byimplRunnanleInterf;

public class MyThreadImlpl {

    public static boolean b = true;
    // Durga's approach of defining of thread

    public static void main(String[] args) throws InterruptedException {

        MyThread m = new MyThread();

        // Passing v obj is also works
        Thread t = new Thread(m);

        m.start();

        t.sleep(1000);
        t.start();

        System.out.println("Main Thread ... ");
    }
}
