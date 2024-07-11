package Z_ROUGH_CODE.thread_practice_rough;

public class Display {

    public void wish(String name) {
        System.out.println("Other codes ");
        for (int i = 0; i < 4; i++) {
            synchronized (this){
                System.out.print("Good Morning : ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("I got intruptted ");
                }

                System.out.println(name);
            }
        }

    }
}
