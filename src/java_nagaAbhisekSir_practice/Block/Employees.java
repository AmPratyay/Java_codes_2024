package java_nagaAbhisekSir_practice.Block;

public class Employees {
    String name;

    static {
        System.out.println("java_nagaAbhisekSir_practice.Block 1...." +details());
        Employees e = new Employees();
        e.name="Pratyay";
        System.out.println(e.name);

    }

    static {
        System.out.println("java_nagaAbhisekSir_practice.Block 2...." );
    }

    static {
        System.out.println("java_nagaAbhisekSir_practice.Block 3...." );
    }

    static String details(){
        return "Pratyay";
    }

    Employees(){
        System.out.println("java_nagaAbhisekSir_practice.Constructor......");
    }

    public static void main(String[] args) {
        new Employees();
    }

    {
        System.out.println("java_nagaAbhisekSir_practice.Block 4......");
    }
}
