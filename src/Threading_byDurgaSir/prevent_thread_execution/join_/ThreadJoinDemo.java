package Threading_byDurgaSir.prevent_thread_execution.join_;

public class ThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();
        t.start();

        t.join(10000);

        for (int i = 0; i < 10; i++) {
            System.out.println("Rama Thread ...");
        }
    }
}
