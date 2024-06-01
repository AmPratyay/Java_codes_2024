package Java_8_DurgaSir.session_10_method_constructor_reference;

public class ReferenceEx {

    public void m1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child  Thread ");
        }
    }

    public static void main(String[] args) {

        ReferenceEx rr = new ReferenceEx();
        Runnable r = rr::m1;

      /* Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread ");
            }
        };
      */

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread ");
        }
    }
}
