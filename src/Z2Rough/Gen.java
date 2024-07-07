package Z2Rough;

public class Gen<T> {

    T ob;

    public Gen (T ob){
        this.ob = ob;
    }

    public void show(){
        System.out.println(ob.getClass().getName());
    }

    public T getOb(){
        return ob;
    }
}
