package java_nagaAbhisekSir_practice.Method;

public class Percentage {

    Percentage(double m,double p ,double c){
        double total = m+p+c;
        calc(total);
    }

    void calc(double total){
        double perc = (total/300)*100;
        System.out.println(perc);
        System.out.println(check(perc));
    }

    String check(double perc){
        if (perc>=40.0)
            return "PASS";
        else
            return "FAIL";
    }

    public static void main(String[] args) {
        new Percentage(70.5,43.5,89);
    }
}
