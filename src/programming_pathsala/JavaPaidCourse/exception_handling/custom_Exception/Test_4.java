package programming_pathsala.JavaPaidCourse.exception_handling.custom_Exception;

public class Test_4 {

    // drawback of finally
    // overshadow the original output

    public static void main(String[] args) {
        System.out.println(cube(8));
    }

    public static int cube(int x){
        try{
            return x*x*x;
        }finally {
            return -1;
        }
    }
}
