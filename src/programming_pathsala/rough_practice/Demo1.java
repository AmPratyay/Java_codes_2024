package programming_pathsala.rough_practice;

public class Demo1 {

    public static void main(String[] args) {

        try{
            String[]  str = {"Ram","shyam"};
            System.out.println(str[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("finally....");
        }

        System.out.println("Pratyay Amrit");

    }
}
