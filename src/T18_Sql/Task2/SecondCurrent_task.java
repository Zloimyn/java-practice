package T18_Sql.Task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class SecondCurrent_task {
    public static void main(String[] args) throws IOException {
        try(Reader reader = new FileReader("filewriter.txt")){
            System.out.println(reader.read());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
