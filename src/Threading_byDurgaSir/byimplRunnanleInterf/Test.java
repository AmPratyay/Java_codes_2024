package Threading_byDurgaSir.byimplRunnanleInterf;

public class Test {

    public static void main(String[] args) {

        MyRunnable m = new MyRunnable();

        Thread t = new Thread(m);

        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread ... ");
        }
    }
}
