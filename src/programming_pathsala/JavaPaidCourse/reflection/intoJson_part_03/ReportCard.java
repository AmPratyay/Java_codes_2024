package programming_pathsala.JavaPaidCourse.reflection.intoJson_part_03;

public class ReportCard {

    private final int id;

    private final ScienceMarks scienceMarks;

    private final ArtsMarks artMarks;

    private final double totalPercentage;

    public ReportCard(int id, ScienceMarks sm, ArtsMarks am, double totalPercentage) {
        this.id = id;
        this.scienceMarks = sm;
        this.artMarks = am;
        this.totalPercentage = totalPercentage;
    }

    public int getId() {
        return id;
    }
}
