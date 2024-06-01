package programming_pathsala.JavaPaidCourse.reflection.part_02;

import java.lang.reflect.Method;

public class MyClassB extends MyClassA{

    public void foo() {
    }

    private void bar() {
    }

    public static void main(String[] args) {
       /* MyClassB mb = new MyClassB();
        Class c = mb.getClass();*/

        // It will print only this class methods including public ,protected ,private and default
/*
        Method[] method = c.getDeclaredMethods();
        for (Method m : method) {
            System.out.println(m.getName());
        }
*/


        // It will print only public methods including parent class public methods
       /* method = c.getMethods();
        for (Method m : method) {
            System.out.println(m.getName());
        }*/


        // It will print all the methods of this class(public ,protected ,default and private)
        // including parent class methods also

        Object o = new MyClassB();
        Class cl = o.getClass();
        while (cl != null) {
            Method[] method = cl.getDeclaredMethods();
            for (Method m : method) {
                System.out.println(m.getName());
            }
            System.out.println("Class Name :   "+cl.getName());
            cl = cl.getSuperclass();
        }
    }
}
