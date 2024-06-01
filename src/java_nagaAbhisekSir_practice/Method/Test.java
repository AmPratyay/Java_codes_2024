package java_nagaAbhisekSir_practice.Method;

public class Test {

    String subj /*= "JAVA"*/;

    public Test(){
        // local variable dominates , In order to print global variable use this keyword
        // default value only generated for global variable but not for local variable
        String subj = "Python";
        System.out.println(subj);
        System.out.println(this.subj);
    }

    int a(int a){
        return a;
    }

    int b(int b){
        return b;
    }
    void sum2(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }

    void araeOfCircle(double radius){
        System.out.println(Math.PI * radius * radius);
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.sum(4,5);
        t1.araeOfCircle(7);
        t1.sum2(t1.a(10),t1.b(30));
    }
}
