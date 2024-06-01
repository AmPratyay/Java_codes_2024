package java_nagaAbhisekSir_practice.toString;

public class Employees {

    String name,company;
    int salary;

    public Employees(String n, String c, int s){
        this.name=n;
        this.company=c;
        this.salary=s;
    }


    @Override
    public String toString(){
        return this.name+"    "+this.company+"  "+this.salary;
    }

    public static void main(String[] args) {
        Employees e1 = new Employees("Sanju","Infosys", 130000);
        //System.out.println(e1.name+"    "+e1.company+"  "+e1.salary);
        System.out.println(e1);
    }
}
