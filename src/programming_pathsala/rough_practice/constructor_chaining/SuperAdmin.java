package programming_pathsala.rough_practice.constructor_chaining;

public class SuperAdmin extends Admin {

    boolean vetoPower;

    public SuperAdmin(String n, int id, int pl, boolean vt) {
        super(n, id, pl);
        this.vetoPower = vt;
        System.out.println(this.vetoPower);
    }

    public static void main(String[] args) {
        SuperAdmin sup = new SuperAdmin("pratyay",1,1,true);
    }
}
