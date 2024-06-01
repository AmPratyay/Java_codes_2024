package Threading_byDurgaSir.thread_name;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Inside child thread ... ");
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);

        System.out.println(Thread.currentThread().getPriority());
    }
}
