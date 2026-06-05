package T18_Sql.Task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Task8 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("filewriter.txt");

        int data = reader.read();
        while (data != -1){
            System.out.println((char) data);
            data = reader.read();
        }

        reader.close();
    }
}
