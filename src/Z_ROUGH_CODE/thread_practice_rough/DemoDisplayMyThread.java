package Z_ROUGH_CODE.thread_practice_rough;

public class DemoDisplayMyThread {


    public static void main(String[] args) {

        Display d = new Display();
        MyThreadDisplay m = new MyThreadDisplay("MS Dhoni", d);
        MyThreadDisplay m2 = new MyThreadDisplay(" Yuvraj singh ", d);
        m.start();
        m2.start();
    }
}
