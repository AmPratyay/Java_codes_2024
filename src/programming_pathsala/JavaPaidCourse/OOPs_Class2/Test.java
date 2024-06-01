package programming_pathsala.JavaPaidCourse.OOPs_Class2;

import programming_pathsala.JavaPaidCourse.OOPs_Class2.Inheritance.Child_a;
import programming_pathsala.JavaPaidCourse.OOPs_Class2.Inheritance.Child_b;
import programming_pathsala.JavaPaidCourse.OOPs_Class2.Inheritance.Parent;

public class Test {

    public static void main(String[] args) {
        Parent p = new Parent();
        //p.foo();  --> Backward method not overridden
        Parent p1 = new Child_a();
        p.func(); // YAY....
        Parent p2 = new Child_b();
        p.func(); // HAHA......
    }
}
