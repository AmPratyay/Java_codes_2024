package Z_ROUGH_CODE;

public class StaticTest {

    private int age;
    private String name;

    public static int count;

    public int getAge() {
        return age;
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

    public void countDetails(){
        System.out.println(count);
    }

    public StaticTest(int a,String n){
        count++;
        this.age=a;
        this.name=n;
    }

    public static void main(String[] args) {
        StaticTest s = new StaticTest(23,"Ravi");
        System.out.println(s.getName()+s.getAge());
         s = new StaticTest(22,"Dhaval");
        System.out.println(s.getName()+s.getAge());
        s.setName("Shyam");
        System.out.println(s.getName());
        s.countDetails();
        System.out.println(count=4);
    }
}
