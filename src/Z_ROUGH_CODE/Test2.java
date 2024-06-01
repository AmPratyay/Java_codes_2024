package Z_ROUGH_CODE;

import java.util.function.Predicate;

public class Test2 {

    public static void main(String[] args) {

        // Anonymous inner class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 11; i++) {
                    System.out.println("Custom Thread : ");
                }
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 11; i++) {
            System.out.println("Main Thread : ");
        }
    }
}
