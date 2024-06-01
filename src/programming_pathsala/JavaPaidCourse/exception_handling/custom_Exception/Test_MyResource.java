package programming_pathsala.JavaPaidCourse.exception_handling.custom_Exception;

public class Test_MyResource {

    public static void main(String[] args) throws Exception {
        read();
    }

    public static void read() throws Exception {

        MyResource myResource = new MyResource();

        Exception var = null;

        try {
            throw new Exception("try block exception");
        } catch (Exception e) {
            var = e;
            throw var;
        } finally {
            try {
                myResource.close();
            } catch (Exception e) {
                if (var == null)
                    throw e;
            }
        }
    }
}
