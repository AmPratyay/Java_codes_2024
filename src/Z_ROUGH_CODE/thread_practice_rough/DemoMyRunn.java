package Z_ROUGH_CODE.thread_practice_rough;

public class DemoMyRunn {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Pratyay_Main");
        System.out.println(Thread.currentThread().getName());
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.setName("Amrit-01");
        t.setPriority(10);
        t.start();
        Thread t2 = new Thread(m);
        t2.setPriority(9);
        t2.setName("Amrit-02");
        t2.start();

        System.out.println("Main Thread ... ");
    }
}
