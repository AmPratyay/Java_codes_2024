package Z_ROUGH_CODE;

import java.util.function.IntToDoubleFunction;

public class Test4 {

    public static void main(String[] args) {

        IntToDoubleFunction f = i -> Math.sqrt(i);
        System.out.println(f.applyAsDouble(9));
    }
}
