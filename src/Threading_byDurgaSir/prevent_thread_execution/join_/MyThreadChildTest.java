package Threading_byDurgaSir.prevent_thread_execution.join_;

public class MyThreadChildTest {

    public static void main(String[] args) throws InterruptedException {

        MyThreadChild.mt = Thread.currentThread();

        MyThreadChild m = new MyThreadChild();

        m.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread ... ");
            Thread.sleep(2000);
        }

    }
}
