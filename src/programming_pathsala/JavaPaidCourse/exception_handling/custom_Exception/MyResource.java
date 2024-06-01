package programming_pathsala.JavaPaidCourse.exception_handling.custom_Exception;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;

public class MyResource implements Closeable {

    @Override
    public void close() throws EOFException {
        System.out.println("inside close");
        throw new EOFException("Finally block exception");
    }
}
