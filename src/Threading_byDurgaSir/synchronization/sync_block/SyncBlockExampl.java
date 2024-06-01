package Threading_byDurgaSir.synchronization.sync_block;

public class SyncBlockExampl {

    public static void main(String[] args) {

        /*
        // Object level lock :

        Displayers d = new Displayers();

        MThread t1 = new MThread("Dhoni",d);
        MThread t2 = new MThread("Yuvraj",d);
        */


        // class level lock :

        Displayers d1 = new Displayers();
        Displayers d2 = new Displayers();

        MThread t1 = new MThread("Dhoni",d1);
        MThread t2 = new MThread("Yuvraj",d2);


        t1.start();
        t2.start();
    }
}
