package Threading_byDurgaSir.synchronization.sync_method;

public class MyThread1 extends Thread{

    Displayer d;
    public MyThread1(Displayer d){
        this.d = d;
    }

    public void run(){
        d.displayn();
    }
}
