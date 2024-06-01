package Java_8_DurgaSir.RunnableExample;

public class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thraed");
        }
    }
}
