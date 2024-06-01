package programming_pathsala.rough_practice;

public class UserManager {

    private final DBAccessor dbAccessor;


    public UserManager(DBAccessor dbAccessor) {
        this.dbAccessor = dbAccessor;
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager(new DBAccessor());
        userManager.dbAccessor.database1();
        userManager.dbAccessor.database2();
    }
}
