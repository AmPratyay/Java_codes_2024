package Threading_byDurgaSir.prevent_thread_execution.thread_intruption;

public class ThreadIntruptDemo {

    public static void main(String[] args) {

        MyThreading t = new MyThreading();
        t.start();
        t.interrupt();

        System.out.println("End of Main ");


    }
}
