package Threading_byDurgaSir.synchronization.sync_method;

public class MeThread extends Thread {

    Display d;

    String name;

    public MeThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}
