package Z2Rough;

public class Temp {

    public String toString(){
        return "temp";
    }

    public void finalize(){
        System.out.println("FInalize method called");
    }
}
