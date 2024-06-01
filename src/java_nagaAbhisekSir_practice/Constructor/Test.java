package java_nagaAbhisekSir_practice.Constructor;

public class Test {

    String product;
    int id;
    int price;

    String company;
    int CompanyId;

    Test(String pdt,int id,int price){
        this.company= "abc";
        this.CompanyId=11;
        //System.out.println(this);
        this.product = pdt;
        this.id = id;
        this.price = price;
    }

    void details(){
        System.out.println(this.id+"   "+product+"   "+ this.company+" "+this.CompanyId);
    }

    public static void main(String[] args) {
        Test t1 = new Test("bbc",1234,4000);
        //t1.id=2234;
        //System.out.println(t1.id +"      "+ t1.company+ t1.CompanyId);
        t1.details();

        t1= new Test("wee",3456,7000);
        //System.out.println(t1.id+"      "+ t1.company+ t1.CompanyId);
        t1.details();
    }

}
