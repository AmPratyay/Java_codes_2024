package programming_pathsala.JavaPaidCourse.reflection.part_01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection_Example {

    public String name;

    public int sal;

    public int post;

    public void foo() {
    }

    public void bar() {
    }

    public static void main(String[] args) {
        Reflection_Example re = new Reflection_Example();

        Class c = re.getClass();

        Method[] m = c.getDeclaredMethods();
        for (Method methods : m) {
            System.out.println(methods.getName());
        }

        Field[] f = c.getDeclaredFields();
        for (Field fields : f) {
            System.out.println(fields.getName());
        }
    }
}
