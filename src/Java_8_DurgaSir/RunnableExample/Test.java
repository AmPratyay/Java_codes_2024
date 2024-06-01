package Java_8_DurgaSir.RunnableExample;

public class Test {


    public static void main(String[] args) {

        // Normal code
        /*MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();*/

        // Code using Lamda Expression

        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
