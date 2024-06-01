package Java_8_DurgaSir.session_08_Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {

        Supplier<Date> s = () -> new Date();

        System.out.println(s.get());

        Supplier<String> s1 = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };

        System.out.println("Your OTP is : " + s1.get());

        // Logic to generate random no
        System.out.println((int) (Math.random() * 10));
    }
}
