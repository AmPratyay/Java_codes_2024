package Z_ROUGH_CODE;

public class Person {
    int age;
    String name;

    final int x;
    public int getAge() {
        return age;
    }

    public int getX() {
        return x;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int a, String n){
        System.out.println(this.age=a);
        System.out.println(this.name=n);
        x = 0;
    }

    void persion(){
        System.out.println("Hi");
    }

}
