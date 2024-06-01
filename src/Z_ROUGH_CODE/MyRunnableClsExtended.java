package Z_ROUGH_CODE;

public class MyRunnableClsExtended /*extends MyRunnableCls*/ {

    public static void main(String[] args) {

        // Normal code

        /*MyRunnableCls m = new MyRunnableClsExtended();
        Thread t = new Thread(m);
        t.start();*/

        Runnable r = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Custom Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Main Thread");
        }

    }
}
