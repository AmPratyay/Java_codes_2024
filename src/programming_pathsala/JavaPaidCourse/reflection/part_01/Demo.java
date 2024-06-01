package programming_pathsala.JavaPaidCourse.reflection.part_01;

import java.lang.reflect.InvocationTargetException;

public class Demo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        new DataManager().manager(new ApacheProcessor());

        new DataManager().manager(new TypeA());

        new DataManager().manager(new TypeB());

    }
}
