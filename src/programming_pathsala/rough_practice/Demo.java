package programming_pathsala.rough_practice;

public class Demo {

    void details(){
        System.out.println("some details");
    }

    void report(){
        System.out.println("Report generated");
    }

    public static void main(String[] args) {
        try{
            Demo d = new Demo();
            d.details();
        }catch(Exception e){
            e.printStackTrace();
        }
        Demo dd = new Demo();
        dd.details();
        dd.report();
    }
}
