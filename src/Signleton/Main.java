package Signleton;

public class Main {

    public static void main(String[] args) {

        App app = App.getInstance();

        System.out.println(app);

        App app1 = App.getInstance();

        System.out.println(app1);

    }
}
