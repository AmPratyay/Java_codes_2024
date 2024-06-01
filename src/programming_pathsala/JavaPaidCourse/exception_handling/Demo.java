package programming_pathsala.JavaPaidCourse.exception_handling;

import javax.naming.directory.InvalidAttributesException;

public class Demo {

    // checked and unchecked exception

    public static void main(String[] args) throws InvalidAttributesException {
        standarized(null);
    }

    public static void standarized(String userName) throws InvalidAttributesException {
        if (userName == null)
            throw new InvalidAttributesException("attribute userNamr cannot be null");
        System.out.println(userName.toLowerCase());
    }
}
