package programming_pathsala.JavaPaidCourse.exception_handling.custom_Exception;

import java.io.FileReader;
import java.io.IOException;

public class Test_3 {

    // not run this code
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 1000000000; i++) {
            read();
        }
    }

    public static void read() throws IOException {
        FileReader fileReader = null;
        String s = null;
        try{
            fileReader = new FileReader("C:\\Users\\praty\\OneDrive\\Documents\\TcsInovation.txt");
            s = "Inside try block";
            System.out.println(s);
        }catch(IOException e){
            s = "Inside catch block";
            System.out.println(s);
        }finally {
            s = "Inside finally block";
            System.out.println(s);
            //assert fileReader != null;
            fileReader.close();
        }
    }
}
