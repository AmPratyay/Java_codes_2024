package programming_pathsala.rough_practice;

public class Tester {

    public static void main(String[] args) {
        Child c = new Child();
        c.func();
        Parent p = new Child();
        p.func();
        Parent pp = new AnotherChild();
        pp.func();

        System.out.println(pp.getClass());

    }
}
