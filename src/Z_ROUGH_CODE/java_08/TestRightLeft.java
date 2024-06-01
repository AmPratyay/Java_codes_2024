package Z_ROUGH_CODE.java_08;

public class TestRightLeft implements Left, Right {


    @Override
    public void m2() {

    }

    @Override
    public void m1() {
        System.out.println("");
        Left.super.m1();
        Right.super.m1();
    }

    @Override
    public void m3() {

    }
}
