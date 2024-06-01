package Threading_byDurgaSir.synchronization.sync_method;

public class Display {

    // synchronized : Object level lock is required by thread
    // static synchronized : class level lock is required by thread
    public static synchronized void wish(String name) {

        for (int i = 0; i < 10; i++) {
            System.out.print("Good  Morning : ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name);
        }
    }
}
