package programming_pathsala.rough_practice.constructor_chaining;

public class Member {

    String name;
    int id;

    public Member(String n, int id) {
        this.name = n;
        this.id = id;
        System.out.println(this.name+this.id);
    }
}
