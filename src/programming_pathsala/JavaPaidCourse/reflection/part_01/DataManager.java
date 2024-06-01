package programming_pathsala.JavaPaidCourse.reflection.part_01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DataManager {

    public void manager(Object dataProcessor) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class c = dataProcessor.getClass();
        Method m = c.getMethod("process");

        // by using setAccessible(true) , we can access private methods also
        /*Method m = c.getDeclaredMethod("process");
        m.setAccessible(true);*/

        m.invoke(dataProcessor);

        // to call parameterised methods of ApacheProcessor
        Method m1 = c.getDeclaredMethod("process", new Class[]{int.class,String.class});
        m1.setAccessible(true);
        m1.invoke(dataProcessor,new Object[]{12,"Pratyay"});


    }
}
