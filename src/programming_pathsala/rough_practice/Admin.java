package programming_pathsala.rough_practice;

public class Admin extends Member {

    int powerLevel;

    public Admin(int id, String n, int p) {
        super(id, n);
        this.powerLevel = p;
    }
}
