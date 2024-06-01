package Z2Rough;

import Java_8_DurgaSir.session_10_method_constructor_reference.Interf;

public class Demon implements MyInter{
    @Override
    public void play(int a, int b) {
        System.out.println("Hello "+a+b);
    }

    public static void main(String[] args) {

        MyInter mm = new Demon();
        mm.play(23,32);
    }
}
