package Threading_byDurgaSir.synchronization.sync_method;

public class SynchronizationDemo {

    public static void main(String[] args) {

        // multiple threads operating on single Object  : Regular output when method is sync but
        // will get irregular output for normal method ( for method do not have sync )

        /*Display d = new Display();
        MeThread t1 = new MeThread(d, "Dhoni");
        MeThread t2 = new MeThread(d, "Yuvraj");
        MeThread t3 = new MeThread(d, "Kohli");
        MeThread t4 = new MeThread(d, "Raina");

        t1.start();
        t2.start();
        t3.start();
        t4.start();*/

        // multiple threads operating on Multiple Objects : Iregular output in case of sync method but
        // will get regular output when there is static sync method

        Display d1 = new Display();
        Display d2 = new Display();
        MeThread t1 = new MeThread(d1, "Dhoni");
        MeThread t2 = new MeThread(d2, "Yuvraj");

        t1.start();
        t2.start();


    }

}
