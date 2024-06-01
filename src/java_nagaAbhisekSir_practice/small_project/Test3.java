package java_nagaAbhisekSir_practice.small_project;

import java.util.Scanner;

public class Test3 {

    public String address(String str,String str1,String str2){
        return "Name :   "+str+" "+str1+"\n"+"Address : "+str2;
    }

    public static void main(String[] args) {
        Test3 t3=new Test3();
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name : ");
        String fName=sc.next();
        System.out.println("Last Name : ");
        String lName=sc.next();
        System.out.println("Address : ");
        String address=sc.next();
        System.out.println(t3.address(fName,lName,address));
    }
}
