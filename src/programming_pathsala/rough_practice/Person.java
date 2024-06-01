package programming_pathsala.rough_practice;

public class Person {

    private int age;
    private String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Name : " + name +"\n"+"Age : "+age);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            throw new RuntimeException("Age cannot negative or zero");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TesterFunc {
    public static void main(String[] args) {
        //Person p = new Person();
    }
}
