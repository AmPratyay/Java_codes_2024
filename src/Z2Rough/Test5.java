package Z2Rough;

public class Test5 {

    public static Test5 s;

    public static void main(String[] args) throws InterruptedException {

        Test5 t = new Test5();
        System.out.println(t.hashCode());
        t = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());
        s = null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("Main method called : Program ends ");

    }

    @Override
    public void finalize() {
        System.out.println("Finalize method called :) ");
        s = this;
    }
}
