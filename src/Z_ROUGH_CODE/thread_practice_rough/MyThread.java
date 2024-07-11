package Z_ROUGH_CODE.thread_practice_rough;

import programming_pathsala.rough_practice.Child;

public class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++){
            System.out.println("Child Thread before sleep");
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("I got InterruptedException : ");
        }
        for (int i = 0; i < 10; i++){
            System.out.println("Child Thread after sleep");
        }
    }
}
