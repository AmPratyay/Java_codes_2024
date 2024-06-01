package Thread;

public class MyAnotherThread extends Thread{

    public void run(){
        for(int i = 10 ; i> 0 ; i--){
            System.out.println(i+"   "+ Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
