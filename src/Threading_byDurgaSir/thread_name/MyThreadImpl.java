package Threading_byDurgaSir.thread_name;

import Threading_byDurgaSir.thread_name.MyThread;

public class MyThreadImpl {

    public static void main(String[] args) {

        System.out.println("Child Thread Name : " + Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setName("Pawan kalyan ");

        MyThread m = new MyThread();

        m.setPriority(9);

        System.out.println(m.getPriority());

        System.out.println(m.getPriority());

        System.out.println("Child Thread Name : " + m.getName());

        m.setName("pratyay");

        Thread t = new Thread(m);

        t.start();

        System.out.println("Child Thread Name : " + m.getName());

        System.out.println("Child Thread Name : " + Thread.currentThread().getName());

    }
}
