package Threading_byDurgaSir.synchronization.sync_block;

public class MThread extends Thread {

    String name;

    Displayers d;

    public MThread(String name, Displayers d) {
        this.name = name;
        this.d = d;
    }

    @Override
    public void run(){
        d.wish(name);
    }
}
