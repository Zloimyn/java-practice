package T18_Sql.Task1;

import java.io.File;

public class Task3 {
    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) {
        File dir = new File(HOME + File.separator + "NewDir");

        boolean created = dir.mkdir();
        if (created){
            System.out.println("Директория создана");
        }

        File newDir = new File(HOME + File.separator + "NewDirRenamed");
        dir.renameTo(newDir);

        boolean deleted = newDir.delete();
        if (deleted){
            System.out.println("Директория удалена");
        }
    }
}
