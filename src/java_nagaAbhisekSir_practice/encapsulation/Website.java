package java_nagaAbhisekSir_practice.encapsulation;

public class Website {

    public static void main(String[] args) {
        Student ss = new Student();
        ss.setName("Rahul");
        ss.setAge(23);
        ss.setPerc(89.09);

        System.out.println(ss.getName()+"   "+ss.getAge()+"  "+ss.getPerc());
    }
}
