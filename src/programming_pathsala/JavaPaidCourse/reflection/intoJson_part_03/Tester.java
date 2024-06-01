package programming_pathsala.JavaPaidCourse.reflection.intoJson_part_03;

public class Tester {

    public static void main(String[] args) throws IllegalAccessException {

        ReportCard reportCard = new ReportCard(11, new ScienceMarks(50, 55, 56, 53.45),
                new ArtsMarks(60, 63, 61.5), 57.60);

        String output = new Serializer2().serialize(reportCard);

        System.out.println(output);
    }
}
