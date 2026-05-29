package T18_Sql.Task1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Task7 {
    public static void main(String[] args) throws IOException {
        Writer filewriter = new FileWriter("filewriter.txt",true);

        filewriter.write("Новая запись в новый файл\n");
        filewriter.write("добавляем текст");

        filewriter.close();
    }
}
