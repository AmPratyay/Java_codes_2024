package java_nagaAbhisekSir_practice.Method;

public class Employees {
    String name;
    String company;
    int salary;

    public void details(String name,String company,int salary){
        this.name=name;
        this.company=company;
        this.salary=salary;
        System.out.println(this);
    }

    public String toString(){
        return this.name+" "+this.company+" "+this.salary;
    }

    public static void main(String[] args) {
        Employees e1 = new Employees();
        e1.details("Pratyay","TCS",100);
        e1.details("Rausan","INFOSYS",1000);
        e1.details("Ankur","NAGGARO",1500);
    }
}
