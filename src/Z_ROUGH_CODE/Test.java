package Z_ROUGH_CODE;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    public String name;
    public int sal;

    public static void main(String[] args) {
        Test t = new Test();
        //System.out.println(t.getClass());
        Class c = t.getClass();
        for (Method m : c.getMethods()) {
            System.out.println(m.getName());
        }
        for (Field f : c.getFields()) {
            System.out.println(f.getName());
        }
    }

    public void foo() {
    }

    public void details() {
    }
}
