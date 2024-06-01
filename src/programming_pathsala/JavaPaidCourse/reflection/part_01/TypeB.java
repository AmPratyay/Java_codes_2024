package programming_pathsala.JavaPaidCourse.reflection.part_01;

public class TypeB implements DataProcessor {

    @Override
    public void process() {
        System.out.println("Type B is processing.....");
    }

    private void process(int id, String name) {
        System.out.println("Type B is processing......"+id+" : "+name);
    }
}
