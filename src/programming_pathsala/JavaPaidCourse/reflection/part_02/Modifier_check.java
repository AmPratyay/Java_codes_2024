package programming_pathsala.JavaPaidCourse.reflection.part_02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Modifier_check {

    public String name;

    public static int id;

    public Modifier_check(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Modifier_check mc = new Modifier_check("Pratyay", 12);

        Field f = mc.getClass().getDeclaredField("id");
        int code = f.getModifiers();
        System.out.println(Modifier.isFinal(code) + " " + Modifier.isStatic(code) + " " + Modifier.isPublic(code) + " \nId : " + f.get(mc));
        System.out.println("Code : " + code);


        Field fe = mc.getClass().getDeclaredField("name");
        int code1 = fe.getModifiers();
        System.out.println(Modifier.isFinal(code1) + " " + Modifier.isStatic(code1) + " " + Modifier.isPublic(code1) + " \nId : " + fe.get(mc));
        System.out.println("Code : " + code1);
    }

}
