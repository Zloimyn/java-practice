package T18_Sql.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("filewriter.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        while (bufferedReader.ready()){
            String ZXC = bufferedReader.readLine();
            System.out.println(ZXC);
        }

        bufferedReader.close();
    }
}
