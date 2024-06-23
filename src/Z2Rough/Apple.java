package Z2Rough;

public class Apple {

    public static void main(String[] args) {
        Fruits f = (a, b) -> {
            System.out.println("Eat apple daily");
            return a * b;
        };

        System.out.println(f.eat(2, 3));

        /*Runnable r = () -> {
            for (int i = 0; i < 11; i++) {
                System.out.println("Child thread");
            }
        };

        Thread t = new Thread(r);
        t.start();*/

        Thread t =  new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++){
                    System.out.println("Child Thread ..");
                }
            }
        };

        t.start();



    }
}
