package programming_pathsala.JavaPaidCourse.exception_handling;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        foo();

        // If you handle the error then also it will get terminated , so generally we do not deal with errors
        /*try{
            List<Integer> l = new ArrayList<>();
            while (true){
                l.add(100);
            }
        } catch(Throwable t){
            t.printStackTrace();
        }*/
    }

    // duck( skip ) the exception by adding the exception in the method body or  --> foo() method
    // to handle the exception use catch block. --> soo() method
    public static void foo() throws FileNotFoundException {
        bar();
    }

    public static void soo() {
        try {
            bar();
        } catch (Exception e) {
            // simply log the exception or do whatever is good
            System.out.println("err....occ....");
        }
    }

    public static void bar() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

}
