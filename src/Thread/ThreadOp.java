package Thread;

public class ThreadOp {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program start");
        int x = 34+43;
        System.out.println("Sum is : "+x);
        Thread.currentThread().setName("pratyyay");
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"    "+t.threadId());
        System.out.println();
        Thread.sleep(5000);
        System.out.println("Program ends ");
    }
}
