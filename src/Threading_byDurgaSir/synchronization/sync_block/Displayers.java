package Threading_byDurgaSir.synchronization.sync_block;

public class Displayers {

    public void wish(String name){
        ;;;;;;;;;;;;;;// Thousand line of code ;;;;;;;;;;;;;;

        //synchronized (this) { // object  level lock
        synchronized (Displayers.class){  // class level lock
            for (int i = 0; i < 10; i++) {
                System.out.print("Good morming : ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(name);
            }
        }

        ;;;;;;;;;;;;;;// Thousand line of code ;;;;;;;;;;;;;;
    }
}
