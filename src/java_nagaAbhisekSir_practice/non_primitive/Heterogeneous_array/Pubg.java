package java_nagaAbhisekSir_practice.non_primitive.Heterogeneous_array;

public class Pubg {

    public Pan button1(){
        return new Pan();
    }

    public Bomb button2(){
        return new Bomb();
    }

    public Gun button3(){
        return new Gun();
    }

    public static void main(String[] args) {
        Pubg pubg = new Pubg();
        Pan p = pubg.button1();
        System.out.println(p);
        Bomb b = pubg.button2();
        System.out.println(b);
        Gun g = pubg.button3();
        System.out.println(g);
    }
}
