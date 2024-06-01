package programming_pathsala.JavaPaidCourse.OOPs_Class2.Inheritance;

public class SuperAdmin extends Admin {

    boolean vetoPower;


    public SuperAdmin(boolean v, int p, int id, String name) {
        /*this.name == error becaues super() must be the first line of code
        otherwise some grabge value or exception occured because name
        filled stilll not initialized*/
        super(p, id, name);
        this.vetoPower = v;
    }
}
