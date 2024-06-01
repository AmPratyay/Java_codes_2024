package programming_pathsala.JavaPaidCourse.exception_handling.custom_Exception;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Test_MyResource_2 {

    public static void main(String[] args) throws FileNotFoundException, EOFException {
        read();
    }

    public static void read() throws FileNotFoundException, EOFException {
        try(MyResource my  = new MyResource()){
            throw new FileNotFoundException();
        }
    }
}
