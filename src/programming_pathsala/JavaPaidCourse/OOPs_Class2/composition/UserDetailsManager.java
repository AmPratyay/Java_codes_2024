package programming_pathsala.JavaPaidCourse.OOPs_Class2.composition;

public class UserDetailsManager {

    private DBAccesser dbAccesser;

    public UserDetailsManager(DBAccesser dbAccesser){
        this.dbAccesser=dbAccesser;
    }

}
