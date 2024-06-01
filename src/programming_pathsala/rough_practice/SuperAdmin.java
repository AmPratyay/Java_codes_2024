package programming_pathsala.rough_practice;

public class SuperAdmin extends Admin {

    boolean vetoPower;

    public SuperAdmin(int id, String n, int p, boolean vp) {
        super(id, n, p);
        this.vetoPower = vp;
    }

}
