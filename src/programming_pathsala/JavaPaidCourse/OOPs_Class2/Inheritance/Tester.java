package programming_pathsala.JavaPaidCourse.OOPs_Class2.Inheritance;

public class Tester {

    public static void main(String[] args) {
        //Parent p = new Parent();
        //p.foo();  --> Backward method not overridden

        Parent p1 = new Child_a();
        p1.func(); // YAY.....

        Parent p2 = new Child_b();
        p2.func(); // HAHA......

        Child_a a = new Child_a();
        a.doWork(); // doing.....

        //Parent p = new Child_a();
        //p.foo();  --> Backward method not overridden


        // Random num
        EvenRandomNum evn = new EvenRandomNum();
        evn.init();
    }
}
