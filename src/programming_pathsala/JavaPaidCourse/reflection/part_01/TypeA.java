package programming_pathsala.JavaPaidCourse.reflection.part_01;

public class TypeA implements DataProcessor {
    @Override
    public void process() {
        System.out.println("Type A is processing.....");
    }

    private void process(int id, String name) {
        System.out.println("Type A is processing....."+id+" : "+name);
    }
}
