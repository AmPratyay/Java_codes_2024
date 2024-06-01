package programming_pathsala.JavaPaidCourse.reflection.part_01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;


public class Main {

    public String empName;
    public int empId;

    public Long mob_no;


    public void foo() {
        System.out.println("foo  Method content...");
    }

    public void soo() {
        System.out.println("soo  Method content...");
    }


    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Main m = new Main();
        System.out.println(m.getClass());
        System.out.println(m.getClass().getName());

        Class c = m.getClass();
        Method mm;
        mm = c.getMethod("foo");
        mm.invoke(m);
        mm = c.getMethod("soo");
        mm.invoke(m);


        for (Method method : c.getMethods()) {
            System.out.println(method.getName());
        }


        for (Field ff : c.getFields()) {
            System.out.println(ff.getName());
        }

        System.out.println();
        System.out.println("All the list of methods in the class.......");
        System.out.println();
        List<Method> list = List.of(c.getMethods());
        System.out.println(list);

    }
}
