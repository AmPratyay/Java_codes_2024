package Java_8_DurgaSir.session_10_method_constructor_reference;

public class ConstructorRefEx {

    public static void main(String[] args) {

        InterfCons i = Sample::new;
        Sample s1 = i.get();
        Sample s2 = i.get();
        Sample s3 = i.get();
        Sample s4 = i.get();

        System.out.println(s1.m1());

    }
}
