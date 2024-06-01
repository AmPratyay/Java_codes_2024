package java_nagaAbhisekSir_practice.small_project;

import java.util.Scanner;

public class Test2 {

    public String doOperation(String str,double a,double b){
        if(str.equalsIgnoreCase("MULTIPLY")){
            return "Answer is : "+ a*b +"   after multiplication";
        }else if (str.equalsIgnoreCase("DIVIDE")){
            return "Answer is : "+ a/b +"   after division";
        } else if (str.equalsIgnoreCase("ADD")) {
            return "Answer is : "+ (a+b) +" after addition";
        } else if (str.equalsIgnoreCase("SUB")) {
            return"Answer is : "+ (a-b) +"   after subtraction";
        }else {
            return"Invalid operation!";
        }
    }

    public static void main(String[] args) {
        Test2 t1 = new Test2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation : MULTIPLY, DIVIDE, ADD, SUB");
        String str = sc.nextLine();
        System.out.println("Enter First Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Number : ");
        double b = sc.nextDouble();
        String answer = t1.doOperation(str,a,b);
        System.out.println(answer);
        if(answer.equals("Invalid operation!")){
            System.out.println("Enter Again Correctly : "+"\n\n");
            System.out.println("Enter operation : MULTIPLY, DIVIDE, ADD, SUB");
            String str1 = sc.nextLine();
            System.out.println("Enter First Number : ");
            a = sc.nextDouble();
            System.out.println("Enter Second Number : ");
            b = sc.nextDouble();
            answer = t1.doOperation(str1,a,b);
            System.out.println(answer);
        }else {
            System.out.println("DO YOU WANT TO RUN AGAIN ? ");
            System.out.println("Enter YES or NO ");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("yes")){
                System.out.println("Enter operation : MULTIPLY, DIVIDE, ADD, SUB");
                String str2 = sc.nextLine();
                System.out.println("Enter First Number : ");
                a = sc.nextDouble();
                System.out.println("Enter Second Number : ");
                b = sc.nextDouble();
                answer = t1.doOperation(str2,a,b);
                System.out.println(answer);
            }else {
                System.out.println("OPERATION PERFORMED SUCCESSFULLY !   ");
                System.out.println();
                System.out.println("-----   *   ! EXIT !   *  -----");
            }
        }

    }
}
