package Z_ROUGH_CODE.thread_practice_rough;

public class MyThreadDisplay extends Thread {

    String name;
    Display display;

    public MyThreadDisplay(String name, Display display) {
        this.name = name;
        this.display = display;
    }

    public void run() {
        display.wish(name);
    }
}
