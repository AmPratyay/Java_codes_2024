package Z_ROUGH_CODE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOddGenImpl extends EvenOrOddGen {

    public boolean isAuth(int a) {
        return super.num(a);
    }

    public boolean isGame(String s) {
        return super.game(s);
    }

    public static void main(String[] args) {
        EvenOrOddGenImpl e = new EvenOrOddGenImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter token : ");
        boolean b = false;
        try {
            b = e.isAuth(sc.nextInt());
        } catch (InputMismatchException ip) {
            System.out.println("Only Integer is allowed : ");
        } catch (Exception exception) {
            System.out.println("Exceptions occurs : " + exception);
        }

        if (b) {
            System.out.println("Giving application access ....");
            System.out.println("Enter the Game Name from the given option : ");
            String str = sc.next();
            if (str.equals("pratyay")) {
                int i = 100;
                while (i >= 0) {
                    i--;
                    System.out.println("Hacker came ... ");
                    if (i % 10 == 0) {
                        System.out.println("Hacker name : " + str.toUpperCase() + " Amrit".toUpperCase());
                    }
                }
                for (int in = 0; in < 10; in++) {
                    System.out.println("Exiting the code .... ");
                }

                System.exit(500);
            }
            boolean bb = e.isGame(str);

            System.out.println(bb == true ? "congratulations :) " : "better luck next time :( ");

        } else {
            System.out.println(" No Luck ...  ");
        }

    }

}
