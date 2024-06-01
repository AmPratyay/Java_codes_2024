package collections_DurgaSir.List.Impl_classes;

import collections_DurgaSir.Bike;
import collections_DurgaSir.Employee;

public class ArrayDis {

    String comp;
    int rank;

    public ArrayDis(String comp,int rank){
        this.comp = comp;
        this.rank = rank;
    }

    public String toString(){
        return comp+rank;
    }

    public static void main(String[] args) {
        Object[] a = new Object[1000];
        a[0] = new Employee("Raju",45000);
        a[1] = new ArrayDis("HCL",21000);
        a[2] = new ArrayDis("TCS",23000);
        a[3] = new Bike("Yamaha", 150000);

        Employee[] e =  new Employee[4];
        e[0]  = new Employee("Chaman",234);

        for(int i = 0 ; i<4 ; i++){
            System.out.println(a[i]+""+e[i]);
        }
    }
}
