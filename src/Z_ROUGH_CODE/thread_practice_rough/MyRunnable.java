package Z_ROUGH_CODE.thread_practice_rough;

public class MyRunnable implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " << Inside Run Method ");
        System.out.println("Child Thread ... " + Thread.currentThread().getPriority());

    }
}
