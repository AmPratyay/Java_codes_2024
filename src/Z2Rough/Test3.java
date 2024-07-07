package Z2Rough;

public class Test3 {

    static int count;

    public static void main(String[] args) throws InterruptedException {

        for (long i = 0; i < 1000000000000000000l; i++) {
            Test3 t = new Test3();
        }
        Thread.sleep(5000);

        System.out.println("Total Object destroyed is : " + count);
    }

    public void finalize() {
        System.out.println("Finalize method id called : " + ++count);
    }
}
