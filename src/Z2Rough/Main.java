package Z2Rough;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Args are : "+args);

        System.out.println("=========================");

        Gen<String> g = new Gen<>("Pratyay");
        g.show();
        System.out.println(g.getOb());

        Gen<Integer> g1 = new Gen<>(1000);
        g1.show();
        System.out.println(g1.getOb());

        Gen<List> g2 = new Gen<>(new ArrayList());
        g2.show();
        System.out.println(g2.getOb());
    }
}
