package java_nagaAbhisekSir_practice.DefaultValues;

public class Test {
    byte by;
    short sh;
    int in;
    long lo;
    float fl;
    double db;
    boolean bn;
    char ch;
    String st;

    public static void main(String[] args){
        Test t = new Test();
        System.out.println(
                t.by+"\n"+t.sh+"\n"+t.in+"\n"+
                t.lo+"\n"+ t.fl+"\n"+ t.db+""+
                "\n" +t.bn+"\n"+t.ch+"\n"+t.st
        );
    }

}
