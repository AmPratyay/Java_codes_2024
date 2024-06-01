package java_nagaAbhisekSir_practice.small_project;

import java.util.Scanner;

import static java.lang.System.*;

public class Test {

    static int amount;

    static int discountInperc;
    public double finalValue(int amountt, int discountInperc) {
        return (finalBill(amountt,discountInperc));
    }

    public double finalBill(double amount,double discountInperc){
        double amt1 = amountAfterDiscount(amount,discountInperc);
        double amt2 = amountWithGst(amt1);
        return  amt1+amt2;
    }

    private double amountAfterDiscount(double amount, double discountInperc) {
        return (amount /100)*(100-discountInperc);
    }

    public double amountWithGst(double amount){
        return sGst(amount)+iGst(amount);
    }

    private double sGst(double amount) {
        return amount*0.05;
    }

    private double iGst(double amount) {
       return  amount*0.07;
    }

    public String toString(){
        return "State_Tax  =  "+sGst(amount)+"\n"+
                "Central_Tax = "+iGst(amount)+"\n"+
                "Grand Total = "+finalValue(amount,discountInperc);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Enter Total Amount : ");
        amount = sc.nextInt();
        out.println("Enter Discount  percent : ");
        discountInperc = sc.nextInt();
        Test t1 = new Test();
        out.println(t1);
    }
}
