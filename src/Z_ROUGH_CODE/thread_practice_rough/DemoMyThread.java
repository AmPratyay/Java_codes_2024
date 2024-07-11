package Z_ROUGH_CODE.thread_practice_rough;

public class DemoMyThread {

    public static void main(String[] args) throws InterruptedException {

        MyThread m = new MyThread();
        m.start();
        System.out.println(m.getName());
        m.interrupt();
        //m.join();
        for (int i = 0; i < 10; i++){
            System.out.println("Main Thread ..... ");
        }

    }
}
