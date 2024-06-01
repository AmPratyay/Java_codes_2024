package Thread;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            Thread.currentThread().setName("pratyay");
            System.out.println("Thread values  :  "+i +"   "+Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();

        Thread th = new Thread(mt);

        MyAnotherThread mat = new MyAnotherThread();

        th.start();
        mat.start();
    }
}
