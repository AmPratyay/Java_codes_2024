package Z_ROUGH_CODE.java_08;

@FunctionalInterface
public interface HandleIntref {

    void inti();

    default void run(){
        System.out.println("Run Default ...");
    }

}
