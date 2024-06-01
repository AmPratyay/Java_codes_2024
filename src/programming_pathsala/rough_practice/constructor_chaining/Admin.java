package programming_pathsala.rough_practice.constructor_chaining;

public class Admin extends Member {

    int powerLevel;

    public Admin(String n, int id, int pl) {
        super(n, id);
        this.powerLevel = pl;
        System.out.println(this.powerLevel);
    }
}
