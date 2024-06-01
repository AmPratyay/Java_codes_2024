package Threading_byDurgaSir.byextendingThread;

public class TestMyThread {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        try {
            myThread.start();
            myThread.start();
        }catch (IllegalThreadStateException e){
            System.out.println(e);
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

    }
}
