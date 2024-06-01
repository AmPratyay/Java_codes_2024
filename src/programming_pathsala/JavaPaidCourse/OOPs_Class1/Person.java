package programming_pathsala.JavaPaidCourse.OOPs_Class1;

public class Person {

    private String name;

    private int age;

    Person(String name, int age) {
        int i=0;
        System.out.println(++i);
        this.name = name;
        this.age = age;
        System.out.println(name+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new RuntimeException("age cannot ne negative");
        }else {
            this.age = age;
        }
    }
}

class Tester{

    public static void main(String[] args) {
        Person p = new Person("Robin", 23);
        //p.age=-9;
        //System.out.println(p.name+p.age);
        p.setAge(9);
        p = new Person("Sunny", 24);
    }
}
