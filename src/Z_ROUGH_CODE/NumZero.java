package Z_ROUGH_CODE;

import java.util.Scanner;
import java.util.function.Function;

public class NumZero {

    static int number;

    static int steps = 0;
    public static void stepsCount(int num){
        int firstNum = number/10;
        int secondNum = number%10;

        while (number != 0){
            steps++;
            if(firstNum>secondNum){
                number = num - firstNum;
            }else {
                number = num - secondNum;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        stepsCount(number);
        

        System.out.println(steps);
    }
}
