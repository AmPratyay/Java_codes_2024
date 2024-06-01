package java_nagaAbhisekSir_practice.non_primitive.Heterogeneous_array;

public class VendingMachine {

    Tea button1() {
        return new Tea();
    }

    Coffee button2() {
        return new Coffee();
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        Object obj = vm.button1();
        Object obj2 = vm.button2();
        System.out.println(obj);
        System.out.println(obj2);

    }
}
