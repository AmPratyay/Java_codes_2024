package Z_ROUGH_CODE.java_08;

public interface Left {

    void m2();

    default void m1() {
        System.out.println("Left default m1");
    }
}
