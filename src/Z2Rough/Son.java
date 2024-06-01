package Z2Rough;

public class Son extends Father{

    public int udhari = 5000;
    public void study(){
        System.out.println("less study ... ");
    }
    public void smoke(){
        System.out.println("Smoking ...");
    }

    public static void main(String[] args) {
        Father f = new Son();



    }

}
