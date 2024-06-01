package programming_pathsala.JavaPaidCourse.OOPs_Class2.Inheritance;

public class Admin extends Member {

    int powerLevel;

    public Admin(int p, int id, String name) {
        super(id, name);
        this.powerLevel = p;
    }
}
